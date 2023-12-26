package com.example.shivamFirst8.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.shivamFirst8.dto.CarDto;
import com.example.shivamFirst8.model.CarData;
import com.example.shivamFirst8.model.UserRegister;
import com.example.shivamFirst8.repository.CarDataRepo;
import com.example.shivamFirst8.repository.UserDataRepo;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDataRepo car;
	@Autowired
	private UserDataRepo userData;

	@Override
	public List<CarDto> getAllData() {

		List<CarDto> l1 = new ArrayList<>();

		List<CarData> ll1 = car.findAll();

		for (CarData s : ll1) {
			CarDto ct = new CarDto();
			ct.setId(s.getId());
			ct.setName(s.getName());
			ct.setBrand(s.getBrand());
			ct.setColor(s.getColor());
			ct.setMileage(s.getMileage());
			ct.setType(s.getType());
			ct.setLaunch_year(s.getLaunch_year());
			ct.setFuelCapacity(s.getFuelCapacity());
			l1.add(ct);
		}
		return l1;
	}

	@Override
	public void save(CarDto CarDto) {

		if (CarDto.getId() == 0) {
			CarData cc = new CarData();
			cc.setId(CarDto.getId());
			cc.setName(CarDto.getName());
			cc.setBrand(CarDto.getBrand());
			cc.setColor(CarDto.getColor());
			cc.setMileage(CarDto.getMileage());
			cc.setType(CarDto.getType());
			cc.setLaunch_year(CarDto.getName());
			cc.setFuelCapacity(CarDto.getFuelCapacity());
			car.save(cc);
		} else {
			CarData cc = car.findById(CarDto.getId()).get();
			cc.setName(CarDto.getName());
			cc.setBrand(CarDto.getBrand());
			cc.setColor(CarDto.getColor());
			cc.setMileage(CarDto.getMileage());
			cc.setType(CarDto.getType());
			cc.setLaunch_year(CarDto.getName());
			cc.setFuelCapacity(CarDto.getFuelCapacity());
			car.save(cc);
		}

	}

	@Override
	public void delete(int id) {

		car.deleteById(id);
	}

	@Override
	public Optional<CarData> getData(int id) {

		return car.findById(id);

	}

	@Override
	public UserRegister registerUser(UserRegister userRegister) {

		String temp = userRegister.getPassword();
		userRegister.setPassword(new BCryptPasswordEncoder().encode(temp));
		return userData.save(userRegister);
	}

}
