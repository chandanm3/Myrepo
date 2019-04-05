package com.auquall.Hoteldatabase.Controller;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.auquall.Hoteldatabase.Dao.HotelDao;
import com.auquall.Hoteldatabase.Models.HotelModels;

@Service
public class HotelService {
	
	 
	@Resource 
	HotelDao hoteldao;
	          
	public List<HotelModels> findAll()
	{
		return hoteldao.findAll();
	}

	
	public void addhotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		hoteldao.addhotel(hotel);
	}

	public void updatehotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		hoteldao.updatehotel(hotel);
			
		
	}

	public void deletehotel(String Id) {
		// TODO Auto-generated method stub
		hoteldao.deletehotel(Id);
}


	public HotelModels gethotels(String Id) {
		// TODO Auto-generated method stub
		return hoteldao.gethotels(Id);
		
	}


	

}