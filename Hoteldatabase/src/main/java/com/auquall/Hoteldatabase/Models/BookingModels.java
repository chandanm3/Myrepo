package com.auquall.Hoteldatabase.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class BookingModels {
	
	@NotNull
	private String BId;
	private String Name;
	private String Checkin;
	private String Checkout;
	private int Rooms;
	private int Adults;
	
	Date date=new Date();
	
	public BookingModels() {
		
	}
	
	
	
	public BookingModels(@NotNull String bid, String name, String checkin, String checkout, int rooms, int adults) {
		super();
		BId = bid;
		Name = name;
		Checkin = checkin;
		Checkout = checkout;
		Rooms = rooms;
		Adults = adults;
	}



	public String getBId() {
		return BId;
	}
	public void setBId(String id) {
		BId = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCheckin() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 String strDate= formatter.format(date);
		    return strDate;
	}
	public void setCheckin(String checkin) {
		this.Checkin = checkin;
	}
	public String getCheckout() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 String strDate= formatter.format(date);
		    return strDate;
	}
	public void setCheckout(String checkout) {
		this.Checkout = checkout;
	}
	public int getRooms() {
		return Rooms;
	}
	public void setRooms(int rooms) {
		this.Rooms = rooms;
	}
	public int getAdults() {
		return Adults;
	}
	public void setAdults(int adults) {
		this.Adults = adults;
	}

}
