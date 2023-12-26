package com.example.task6.service.customerservice;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.task6.dto.ResponseDto;
import com.example.task6.exception.CustomerNotFoundException;
import com.example.task6.model.Customer;
import com.example.task6.model.Product;
import com.example.task6.repository.CustomerRepo;
import com.example.task6.repository.ProductRepo;

@Service
public class CustomerServiceImple implements CustomerInterface {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ProductRepo productRepo;

	// Creating the response Dto object
	private ResponseDto response = new ResponseDto();

	private final String DIRECTORY_URI = "C:\\Users\\shivamjha\\Downloads\\Photos";

	private void setResponseData(int status, String message, Object ok) {
		response.setStatus(status);
		response.setMessage(message);
		response.setData(ok);
	}

	@Override
	public ResponseDto displayAllData() {
		setResponseData(200, "Data fetched succesfully", customerRepo.findAll());
		System.out.println(response);
		return response;
	}

	@Override
	public ResponseDto saveNewCustomerData(Customer customer) {
		try {
			Customer new_customer = customerRepo.save(customer);
			setResponseData(200, "Data saved succesfully", new_customer);
		} catch (Exception e) {
			setResponseData(404, "Data cann't saved", "Data can not be saved to database due to technical error");
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public Customer deleteCustomerDataById(int id) {

		Customer customer = customerRepo.findById(id).orElse(null);
		if (ObjectUtils.isEmpty(customer)) {
			throw new CustomerNotFoundException("The customer is not exist in database");
		} else {
			customerRepo.deleteById(id);
		}
		return customer;
	}

	@Override
	public ResponseDto addDataByProductIdAndCustomerId(int cId, int pId) {

		Customer existing_customer = customerRepo.findById(cId).orElse(null);
		Product existing_product = productRepo.findById(pId).orElse(null);
		if (existing_customer != null && existing_product != null) {
			existing_product.setId(pId);
			existing_customer.setProduct(existing_product);
			customerRepo.save(existing_customer);
			setResponseData(200, "The Customer Data set", existing_customer);
		} else {
			if (existing_customer == null) {
				setResponseData(404, "The Customer Data not found", "customer not found");
			} else if (existing_product == null) {
				setResponseData(404, "The product Data not found", "product not found");
			} else {
				setResponseData(404, "The Customer Data && the product data both not found",
						"customer and product not found");
			}
		}

		return response;
	}

	@Override
	public ResponseDto editCustomerDataById(Customer customer) {
		Customer updated_customer = customerRepo.findById(customer.getId()).orElse(null);

		if (updated_customer != null) {
			updated_customer.setName(customer.getName());
			updated_customer.setEmail(customer.getEmail());
			updated_customer.setContact(customer.getContact());
			updated_customer.setId(customer.getId());
			customerRepo.save(updated_customer);
			setResponseData(200, "Data updated", updated_customer);
		} else {
			setResponseData(400, "Data cann't be update", "Data can not be deleted because of some technical issue");
		}
		return response;
	}

	@Override
	public ResponseDto uploadFile(MultipartFile file) {
		try {

			File directory = new File(DIRECTORY_URI);
			if (!directory.exists()) {
				directory.mkdirs();
			}
			String fileName = file.getOriginalFilename();
			Path filePath = Paths.get(DIRECTORY_URI).resolve(fileName);
			Files.write(filePath, file.getBytes(), StandardOpenOption.CREATE);
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/customer/download/")
					.path(fileName).toUriString();

			setResponseData(200, "File uploaded succesfully",
					"File uploaded successfully. Download URL: " + fileDownloadUri);
		} catch (Exception e) {
			setResponseData(500, "The file can not be uploaded", "The file cannot be upload to server");
		}

		return response;
	}

	@Override
	public ResponseEntity<Object> downloadFile(String fileName) {
		// TODO Auto-generated method stub
		try {
			System.out.println(fileName);
			Path filePath = Paths.get(DIRECTORY_URI).resolve(fileName).normalize();
			File file = filePath.toFile();
			HttpHeaders headers = new HttpHeaders();
			if (file.exists()) {

				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.setContentDispositionFormData("Attach", fileName);

				return ResponseEntity.ok().headers(headers).contentLength(file.length())
						.body(new FileSystemResource(file));
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Failed to download the file: " + ex.getMessage());
		}
	}
}
