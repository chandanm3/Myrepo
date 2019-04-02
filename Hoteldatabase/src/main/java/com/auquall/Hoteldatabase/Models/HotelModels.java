package com.auquall.Hoteldatabase.Models;

import javax.persistence.Column;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="Hotel_Details")
public class HotelModels {
	
	
	@NotNull
	@Column(name="Id")
	private String Id;
	@Column(name="H_Name")
	private String Name;
	@Column(name="Address")
	private String Address;
	@Column(name="Mobile")
	private String Mobile;
	@Column(name="Email")
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
