package com.example.task4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task4.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
