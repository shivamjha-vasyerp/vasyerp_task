package com.example.task5.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.task5.dto.DeleteFormateDto;
import com.example.task5.model.Country;
import com.example.task5.service.CountryInter;

@RestController
@RequestMapping("/country")
public class MainController {

	@Autowired
	private CountryInter country;
	
	@GetMapping("/")
	public List<Country> index()
	{
		return country.getAllData();
	}
	
	@PostMapping("/addCountryData")
	public Country addData(@RequestBody Country country_s)
	{
		return country.addData(country_s);
	}
	
	@DeleteMapping("/deleteCountryData")
	public ResponseEntity<DeleteFormateDto> deleteData(@RequestParam("id") int id)
	{
		DeleteFormateDto d1 = country.deleteData(id);
		return new ResponseEntity<DeleteFormateDto>(d1,HttpStatusCode.valueOf(d1.getStatus()));
	}
	
	@PutMapping("/addStateToCountry")
	public Country addStateToCountry(@RequestParam("cId") int cId,@RequestBody List<Object> sId)
	{
		HashMap h1 = (HashMap)sId.get(0);
		return country.addStateToCountry(cId,(List<Integer>) h1.get("sId"));
	}
}
