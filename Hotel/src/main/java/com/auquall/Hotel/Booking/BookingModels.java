package com.auquall.Hotel.Booking;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


public class BookingModels {
	@NotNull
	private String Id;
	@NotNull
	@Size(min=5,max=20)
	private String Name;
	@NotNull
	private String City;
	@NotNull	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date Checkin;
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date Checkout;
	@NotNull
	@Min(value=1,message="Atleast 1")
	@Max(value=10,message="Less then 10")
	private int Rooms;
	@NotNull
	@Min(value=1,message="Atleast 1")
	@Max(value=3,message="Less then 3")
	private int Adults;
	
	public BookingModels()
	{
		
	}
	
	
	public BookingModels(String id, String name, String city, Date checkin, Date checkout, int rooms, int adults) {
		super();
		Id = id;
		Name = name;
		City = city;
		Checkin = checkin;
		Checkout = checkout;
		Rooms = rooms;
		Adults = adults;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getCheckin() {
		return Checkin;
	}
	public void setCheckin(Date checkin) {
		Checkin = checkin;
	}
	public Date getCheckout() {
		return Checkout;
	}
	public void setCheckout(Date checkout) {
		Checkout = checkout;
	}
	public int getRooms() {
		return Rooms;
	}
	public void setRooms(int rooms) {
		Rooms = rooms;
	}
	public int getAdults() {
		return Adults;
	}
	public void setAdults(int adults) {
		Adults = adults;
	}
	
	
	

}
