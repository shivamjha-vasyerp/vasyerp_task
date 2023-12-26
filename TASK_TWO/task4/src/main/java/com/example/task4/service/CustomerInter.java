package com.example.task4.service;

import java.util.List;

import com.example.task4.dto.DeleteFormateDto;
import com.example.task4.model.Customer;

public interface CustomerInter {
    List<Customer> displayAllData();
    Customer saveNewCustomerData(Customer customer);
    DeleteFormateDto deleteCustomerDataById(int id);
    DeleteFormateDto addDataByProductIdAndCustomerId(int cId,int pId);
}
