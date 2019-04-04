package com.auquall.Hoteldatabase.Models;

import javax.validation.constraints.NotNull;

public class HotelModels {
	
	
	@NotNull
	private String Id;
	private String Name;
	private String Address;
	private String Mobile;
	private String Email;
	
	public HotelModels() {
		
	}
	public HotelModels(String id, String name, String address, String mobile, String email) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Mobile = mobile;
		Email = email;
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
	
	

}
