package com.auquall.Hotel;


public class HotelModels {
	

private int Id;
private String Name;
private String Address;
private String Mobile;
private String Email;

public HotelModels()
{
	
}

public HotelModels(int id, String name, String address,String i, String email) {
	super();
	Id = id;
	Name = name;
	Address = address;
	Mobile = i;
	Email = email;
}



public int getId() {
	return Id;
}
public void setId(int id) {
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
