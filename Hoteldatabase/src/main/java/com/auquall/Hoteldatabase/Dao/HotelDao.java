package com.auquall.Hoteldatabase.Dao;

import java.util.List;

import com.auquall.Hoteldatabase.Models.HotelModels;

public interface HotelDao {
	
	public List<HotelModels> findAll();
	public void addhotel(HotelModels hotel);
	public void updatehotel(HotelModels hotel);
	public void deletehotel(String Id);
    public HotelModels gethotels(String Id);

}
