package com.auquall.Hoteldatabase.BookingController;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.auquall.Hoteldatabase.BookingDao.Bookingdao;
import com.auquall.Hoteldatabase.Models.BookingModels;

@Service
public class BookingService {

	@Resource
	Bookingdao bookingdao;
	
	public List<BookingModels> findAll() {
		// TODO Auto-generated method stub
		return bookingdao.findAll();
	}
	public void addbooking(BookingModels book) {
		// TODO Auto-generated method stub
		bookingdao.addbooking(book);
	}
	public void updatebooking(BookingModels book) {
		// TODO Auto-generated method stub
		bookingdao.updatebooking(book);
	}
	public void deletebooking(String Id) {
		// TODO Auto-generated method stub
		bookingdao.deletebooking(Id);
	}
	public BookingModels getbooking(String Id) {
		// TODO Auto-generated method stub
		return bookingdao.getbooking(Id);
	}

}
