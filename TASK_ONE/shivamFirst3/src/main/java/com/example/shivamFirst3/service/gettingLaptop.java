package com.example.shivamFirst3.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.shivamFirst3.model.LaptopData;

@Service
public class gettingLaptop implements gettingLaptopInter{
    ArrayList<LaptopData> l1 = new ArrayList<>();
    
    public void setData()
    {
    	LaptopData i0 = new LaptopData();
    	i0.setName("Apple macbook air");
    	i0.setColor("Mat Black");
    	i0.setBatteryMah("4200 Mah");
    	i0.setHasCharget("Yes");
    	
    	LaptopData i1 = new LaptopData();
    	i1.setName("Dell inspiron");
    	i1.setColor("Black");
    	i1.setBatteryMah("3200 Mah");
    	i1.setHasCharget("Yes");
    	
    	LaptopData i2 = new LaptopData();
    	i2.setName("Lenovo Legion");
    	i2.setColor("White");
    	i2.setBatteryMah("3400 Mah");
    	i2.setHasCharget("Yes");
    	
    	LaptopData i3 = new LaptopData();
    	i3.setName("Intell 55055");
    	i3.setColor("Grey");
    	i3.setBatteryMah("3700 Mah");
    	i3.setHasCharget("Yes");
    	
    	l1.add(i0);
    	l1.add(i3);
    	l1.add(i2);
    	l1.add(i1);
    	
    }
	@Override
	public void getCurrentModel() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1.get(0));
	}

	@Override
	public void getAllModel() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1);
	}

}
