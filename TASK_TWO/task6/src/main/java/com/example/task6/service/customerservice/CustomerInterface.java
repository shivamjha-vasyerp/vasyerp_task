package com.example.task6.service.customerservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.task6.dto.ResponseDto;
import com.example.task6.model.Customer;

public interface CustomerInterface {
	ResponseDto displayAllData();

	ResponseDto saveNewCustomerData(Customer customer);

	Customer deleteCustomerDataById(int id);

	ResponseDto editCustomerDataById(Customer customer);

	ResponseDto addDataByProductIdAndCustomerId(int cId, int pId);

	ResponseDto uploadFile(MultipartFile file);

	ResponseEntity<Object> downloadFile(String filename);
}
