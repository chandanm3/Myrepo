package com.auquall.Hoteldatabase.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auquall.Hoteldatabase.Models.HotelModels;

public class HotelMapper implements RowMapper<HotelModels> {

	@Override
	public HotelModels mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		HotelModels hotel=new HotelModels();
		hotel.setId(rs.getString("Id"));
		hotel.setName(rs.getString("H_Name"));
		hotel.setAddress(rs.getString("Address"));
		hotel.setMobile(rs.getString("Mobile"));
		hotel.setEmail(rs.getString("Email"));
		return hotel;
		
	}

}
