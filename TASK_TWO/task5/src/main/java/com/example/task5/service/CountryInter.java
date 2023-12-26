package com.example.task5.service;

import java.util.List;

import com.example.task5.dto.DeleteFormateDto;
import com.example.task5.model.Country;

public interface CountryInter {
	List<Country> getAllData();
	Country addData(Country country);
	DeleteFormateDto deleteData(int id);
	Country addStateToCountry(int cId,List<Integer> sId);
}
