package com.example.shivamFirst5.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.shivamFirst5.model.pcData;

@Service
public class PcInfoImpl implements pcInformationInter {
	ArrayList<pcData> l1 = new ArrayList<>();

	@Override
	public void getIP() {
		// TODO Auto-generated method stub
		String s = ip_extract();
		System.out.println("Your pc's ip address is:" + s);

	}

	@Override
	public void getDetailedView() {
		// TODO Auto-generated method stub
		l1.clear();
		pcData d1 = new pcData();
		d1.setPc_name("Lenovo");
		d1.setOs_name(System.getProperty("os.name"));
		d1.setOperating_system_type(System.getProperty("os.arch"));
		d1.setOsVersion(System.getProperty("os.version"));
		d1.setProcesser_architecture(System.getenv("PROCESSOR_ARCHITECTURE"));
		d1.setNo_of_processors(System.getenv("NUMBER_OF_PROCESSORS"));
		l1.add(d1);
		System.out.println(l1.get(0));
	}

	public String ip_extract() {
		InetAddress s;
		String ip;
		try {
			s = InetAddress.getLocalHost();
			ip = s.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ip = "Unable to fetch ip";
		}

		return ip;
	}
}
