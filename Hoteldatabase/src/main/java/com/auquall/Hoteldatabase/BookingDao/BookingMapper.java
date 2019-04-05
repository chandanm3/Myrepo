package com.auquall.Hoteldatabase.BookingDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auquall.Hoteldatabase.Models.BookingModels;

public class BookingMapper implements RowMapper<BookingModels> {

	@Override
	public BookingModels mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookingModels book=new BookingModels();
		book.setBId(rs.getString("B_Id"));
		book.setName(rs.getString("H_Name"));
		book.setCheckin(rs.getString("Checkin"));
		book.setCheckout(rs.getString("Checkout"));
		book.setRooms(rs.getInt("Rooms"));
		book.setAdults(rs.getInt("Adults"));
		return book;
	}

}
