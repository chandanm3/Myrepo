package com.auquall.Userrequest.Models;

import java.text.SimpleDateFormat;

import java.util.Date;

public class UserModels {

	private String Id;
	private String Name;
	private String DOB;
	private String Address;
	private String Mobile;
	private String Email;
	private String Password;
	

	Date date=new Date();
	public UserModels() {
		
	}

	public UserModels(String id, String name, String dOB, String address, String mobile, String email, String password) {
		super();
		Id = id;
		Name = name;
		DOB = dOB;
		Address = address;
		Mobile = mobile;
		Email = email;
		Password=password;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOB() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 DOB= formatter.format(date);	
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	
	
}
