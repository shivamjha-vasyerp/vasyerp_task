package com.example.shivamFirst4.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.shivamFirst4.model.BollywoodData;

@Service
public class BollywoodImpl implements bollywoodInterfa {
ArrayList<BollywoodData> l1 = new ArrayList<>();
    
    public void setData()
    {
    	BollywoodData h1 = new BollywoodData();
    	h1.setCurrent_trending("Ek Tha Tiger");
    	h1.setUpcoming_movie_id("0");
    	h1.setUpcoming_movie("PK");
    	h1.setUpcoming_movie_hero("AmirKhan");
    	h1.setUpcoming_movie_release_date("12/02/2020");
    	
    	BollywoodData h2 = new BollywoodData();
    	h2.setCurrent_trending("Ek Tha Tiger");
    	h2.setUpcoming_movie_id("1");
    	h2.setUpcoming_movie("Jawan");
    	h2.setUpcoming_movie_hero("Shah rukh khan");
    	h2.setUpcoming_movie_release_date("12/02/2022");
    	
    	l1.add(h1);
    	l1.add(h2);
    	
    }
	@Override
	public void upcoming() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1);
	}

	@Override
	public void trending() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1.get(0).getCurrent_trending());
	}

}
