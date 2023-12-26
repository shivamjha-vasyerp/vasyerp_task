package com.example.shivamFirst5.model;

public class pcData {
private String pc_name;

private String Os_name;
private String Operating_system_type;
private String osVersion;
private String processer_architecture;
private String no_of_processors;
public String getPc_name() {
	return pc_name;
}
public void setPc_name(String pc_name) {
	this.pc_name = pc_name;
}


public String getOs_name() {
	return Os_name;
}
public void setOs_name(String os_name) {
	Os_name = os_name;
}
public String getOperating_system_type() {
	return Operating_system_type;
}
public void setOperating_system_type(String operating_system_type) {
	Operating_system_type = operating_system_type;
}
public String getOsVersion() {
	return osVersion;
}
public void setOsVersion(String osVersion) {
	this.osVersion = osVersion;
}
public String getProcesser_architecture() {
	return processer_architecture;
}
public void setProcesser_architecture(String processer_architecture) {
	this.processer_architecture = processer_architecture;
}
public String getNo_of_processors() {
	return no_of_processors;
}
public void setNo_of_processors(String no_of_processors) {
	this.no_of_processors = no_of_processors;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pc Name: "+pc_name+", Os name: "+Os_name+", Os Version: "+osVersion+", Processer Architecture"+processer_architecture+", No of cores: "+no_of_processors;
	}
}
