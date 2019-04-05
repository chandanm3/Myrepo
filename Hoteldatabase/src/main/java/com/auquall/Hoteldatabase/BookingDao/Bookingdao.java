package com.auquall.Hoteldatabase.BookingDao;

import java.util.List;

import com.auquall.Hoteldatabase.Models.BookingModels;

public interface Bookingdao {
	
	public List<BookingModels> findAll();
	public void addbooking(BookingModels book);
	public void updatebooking(BookingModels book);
	public void deletebooking(String Id);
    public BookingModels getbooking(String Id);

}
