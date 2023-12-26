package com.example.shivamFirst2.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.shivamFirst2.model.IphoneData;

@Service
public class gettingIphone implements gettingIphoneInter{
    ArrayList<IphoneData> l1 = new ArrayList<>();
    
    public void setData()
    {
    	IphoneData i0 = new IphoneData();
    	i0.setName("14 Pro Max");
    	i0.setColor("Mat Black");
    	i0.setBatteryMah("4200 Mah");
    	i0.setHasCharget("Yes");
    	
    	IphoneData i1 = new IphoneData();
    	i1.setName("11 Pro Max");
    	i1.setColor("Black");
    	i1.setBatteryMah("3200 Mah");
    	i1.setHasCharget("Yes");
    	
    	IphoneData i2 = new IphoneData();
    	i2.setName("12 Pro Max");
    	i2.setColor("White");
    	i2.setBatteryMah("3400 Mah");
    	i2.setHasCharget("Yes");
    	
    	IphoneData i3 = new IphoneData();
    	i3.setName("13 Pro Max");
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
