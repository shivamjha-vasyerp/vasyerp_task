/**
 * 
 */
package com.example.task5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task5.model.Country;

/**
 * 
 */
public interface CountryRepo extends JpaRepository<Country, Integer> {

}
