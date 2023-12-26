package com.example.task4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task4.dto.DeleteFormateDto;
import com.example.task4.model.Customer;
import com.example.task4.model.Product;
import com.example.task4.repository.CustomerRepo;
import com.example.task4.repository.ProductRepo;

@Service
public class CustomerImple implements CustomerInter {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ProductRepo productRepo;

	private DeleteFormateDto d1 = new DeleteFormateDto();
//	@Autowired
//	private ProductRepo productRepo;

	public void setDeleteDataFormate(Object ok, String message, int status) {
		d1.setData(ok);
		d1.setMessage(message);
		d1.setStatus(status);
	}

	@Override
	public List<Customer> displayAllData() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public Customer saveNewCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	// TODO Auto-generated method stub
	public DeleteFormateDto deleteCustomerDataById(int id) {

		Customer c1 = customerRepo.findById(id).orElse(null);
		
		if (c1 != null) {
			customerRepo.deleteById(id);
			setDeleteDataFormate("Data Found", "Data found and deleted succesfully", 200);
		} else {
			setDeleteDataFormate("not found", "Data not found", 404);
		}
		return d1;
	}

	@Override
	public DeleteFormateDto addDataByProductIdAndCustomerId(int CId, int pId) {

		Customer c1 = customerRepo.findById(CId).orElse(null);
		Product p1 = productRepo.findById(pId).orElse(null);
		if (c1 != null && p1!=null) {
			p1.setId(pId);
			c1.setProduct(p1);
			customerRepo.save(c1);
			setDeleteDataFormate(c1, "The Customer Data set", 200);
		}
		else {
			if(c1==null)
			{
				setDeleteDataFormate("customer not found", "The Customer Data not found", 404);
			}
			else if(p1==null) {
				setDeleteDataFormate("product not found", "The product Data not found", 404);
			}
			else {
				setDeleteDataFormate("customer and product not found", "The Customer Data && the product data both not found", 404);
			}
		}
		return d1;
	}

}
