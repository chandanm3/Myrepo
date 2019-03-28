package com.auquall.Hotel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class HotelModels {
	
	@NotNull
	private String Id;
	
	@NotNull
	@Size(min=5,max=20,message="Name should be min 3 and max 20 character")
	private String Name;
	
	@NotNull
	private String Address;
	@NotNull
	private String Mobile;
	@javax.validation.constraints.Email(message="Wrong Email")
	private String Email;

	public HotelModels()
	{
		
	}

	public HotelModels(String id, String name, String address,String i, String email) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Mobile = i;
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
