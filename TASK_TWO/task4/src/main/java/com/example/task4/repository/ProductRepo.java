package com.example.task4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task4.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
