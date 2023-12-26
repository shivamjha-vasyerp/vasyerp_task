package com.example.shivamFirst8.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shivamFirst8.model.CarData;

@Repository
public interface CarDataRepo extends JpaRepository<CarData, Integer> {

	@Query("SELECT s FROM CarData as s ORDER BY s.id ASC")
	List<CarData> findAll();
	
}
