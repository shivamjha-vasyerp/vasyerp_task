package com.example.task6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.task6.dto.ResponseDto;
import com.example.task6.model.Customer;
import com.example.task6.service.customerservice.CustomerInterface;

@RestController
@RequestMapping("/customer")
public class MainController {

	@Autowired
	private CustomerInterface customerInter;

	private ResponseDto response;
//	private final String DIRECTORY_URI = "C:\\Users\\shivamjha\\Downloads\\Photos";

	@GetMapping("/showData")
	public ResponseEntity<ResponseDto> displayData() {
		response = customerInter.displayAllData();
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@PostMapping("/addData")
	public ResponseEntity<ResponseDto> addCustomerData(@RequestBody Customer customer) {
		response = customerInter.saveNewCustomerData(customer);
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@DeleteMapping("/deleteData")
	public ResponseEntity<ResponseDto> deleteCustomerData(@RequestParam("id") int id) {
		Customer customer = customerInter.deleteCustomerDataById(id);
		if(ObjectUtils.isEmpty(customer))
		{
			response.setData(customer);
			response.setMessage("User data deleted succesfully");
			response.setStatus(200);
			
		}
		return  new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@PutMapping("/editData")
	public ResponseEntity<ResponseDto> editCustomerData(@RequestBody Customer customer) {
		response = customerInter.editCustomerDataById(customer);
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@PutMapping("/addProductToCustomer")
	public ResponseEntity<ResponseDto> addProductToCustomerData(@RequestParam("cId") int cId,
			@RequestParam("pId") int pId) {
		response = customerInter.addDataByProductIdAndCustomerId(cId, pId);
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@PutMapping("/uploadFile")
	public ResponseEntity<ResponseDto> uploadFileToServer(@RequestParam("file") MultipartFile file) {
		response = customerInter.uploadFile(file);
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getStatus()));
	}

	@GetMapping("/download/{filename}")
	public ResponseEntity<Object> downloadFileToServer(@PathVariable String filename) {
		return customerInter.downloadFile(filename);
	}
}
