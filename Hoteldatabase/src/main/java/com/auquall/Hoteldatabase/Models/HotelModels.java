package com.auquall.Hoteldatabase.Models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HotelModels {
	
	
	@NotNull
	private String Id;
	@NotNull
	@Size(min=5,max=50)
	private String Name;
	@NotNull
	@Size(min=5,max=100)
	private String Address;
	@NotNull
	private String Mobile;
	@javax.validation.constraints.Email
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
