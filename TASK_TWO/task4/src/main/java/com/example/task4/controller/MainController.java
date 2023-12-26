package com.example.task4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.task4.dto.DeleteFormateDto;
import com.example.task4.model.Customer;
import com.example.task4.service.CustomerInter;

@Controller
@RequestMapping("/customer")
public class MainController {
	
	@Autowired
	private CustomerInter customerInter;
	
	@GetMapping("/")
	@ResponseBody
	public List<Customer> displayData()
	{
		return customerInter.displayAllData();
	}
	
	@PostMapping("/addData")
	@ResponseBody
	public Customer addData(@RequestBody Customer customer)
	{
		return customerInter.saveNewCustomerData(customer); 
	}
	
	@DeleteMapping("/deleteData")
	@ResponseBody
	public ResponseEntity<DeleteFormateDto> deleteData(@RequestParam("id") int id)
	{
		DeleteFormateDto d1 = customerInter.deleteCustomerDataById(id);
		return new ResponseEntity<DeleteFormateDto>(d1,HttpStatusCode.valueOf(d1.getStatus()));
	}
	
	
	@PutMapping("/addProduct")
	@ResponseBody
	public ResponseEntity<DeleteFormateDto> addDataByProductId(@RequestParam("cId") int cid,@RequestParam("pId") int pIds)
	{
//		@SuppressWarnings("rawtypes")
//		HashMap h1 = (HashMap)pIds.get(0);
//		return customerInter.addDataByProductIdAndCustomerId(cid,(List<Integer>)h1.get("pIds"));
		DeleteFormateDto d1 = customerInter.addDataByProductIdAndCustomerId(cid,pIds);
		
		return new ResponseEntity<DeleteFormateDto>(d1,HttpStatusCode.valueOf(d1.getStatus()));
	}
	
}
