package com.example.shivamFirst4.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.shivamFirst4.model.HollywoodData;

@Service
public class HollywoodImpl implements hollywoodInterfa {
    ArrayList<HollywoodData> l1 = new ArrayList<>();
    
    public void setData()
    {
    	HollywoodData h1 = new HollywoodData();
    	h1.setCurrent_trending("Avengers EndGame");
    	h1.setUpcoming_movie_id("0");
    	h1.setUpcoming_movie("Batman: The dark knight");
    	h1.setUpcoming_movie_hero("Christian Bale");
    	h1.setUpcoming_movie_release_date("12/02/2021");
    	
    	HollywoodData h2 = new HollywoodData();
    	h2.setCurrent_trending("Avengers EndGame");
    	h2.setUpcoming_movie_id("1");
    	h2.setUpcoming_movie("Superman: Man of Steel");
    	h2.setUpcoming_movie_hero("Henry Cavil");
    	h2.setUpcoming_movie_release_date("12/02/2015");
    	
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
