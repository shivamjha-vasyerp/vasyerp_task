package com.example.task5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task5.dto.DeleteFormateDto;
import com.example.task5.model.Country;
import com.example.task5.model.State;
import com.example.task5.repository.CountryRepo;

@Service
public class CountryImple implements CountryInter {

	@Autowired
	private CountryRepo country;

	@Override
	public List<Country> getAllData() {
		// TODO Auto-generated method stub
		return country.findAll();
	}

	@Override
	public Country addData(Country country_s) {
		// TODO Auto-generated method stub
		return country.save(country_s);
	}

	@Override
	public DeleteFormateDto deleteData(int id) {
		// TODO Auto-generated method stub
		Country c = country.findById(id).orElse(null);
		DeleteFormateDto d1 = new DeleteFormateDto();
		if (c != null) {
			d1.setData("ok");
			d1.setMessage("Data found");
			d1.setStatus(200);
			country.deleteById(id);
		} else {
			d1.setData("Not ok");
			d1.setMessage("Data not found");
			d1.setStatus(405);
		}
		return d1;
	}

	@Override
	public Country addStateToCountry(int cId, List<Integer> sId) {
		// TODO Auto-generated method stub
		Country c1 = country.findById(cId).get();
		List<State> l1 = new ArrayList<State>();
		
		
//		State s1 = new State();
//		s1.setId(sId);
//		l1.add(s1);
//		c1.setStates(l1);

		return country.save(c1);
	}

}
