package com.example.shivamFirst8.service;

import java.util.List;
import java.util.Optional;

import com.example.shivamFirst8.dto.CarDto;
import com.example.shivamFirst8.model.CarData;
import com.example.shivamFirst8.model.UserRegister;

public interface CarService {
	List<CarDto> getAllData();

	void save(CarDto CarDto);

	void delete(int id);

	Optional<CarData> getData(int id);

	UserRegister registerUser(UserRegister userRegister);
}
