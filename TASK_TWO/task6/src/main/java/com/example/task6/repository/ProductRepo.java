package com.example.task6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task6.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
