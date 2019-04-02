package com.auquall.Hoteldatabase.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.auquall.Hoteldatabase.Models.HotelModels;

@Service
public class HotelService {
	private List<HotelModels> hotels=new ArrayList<>(Arrays.asList());    
	          
	public List<HotelModels> findAll()
	{
		return hotels;
	}

	public HotelModels gethotel(String Id) {
	  return hotels.stream().filter(t ->t.getId().equals(Id)).findFirst().get();
		
	}

	public void addhotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		hotels.add(hotel);
	}

	public void updatehotel(String Id, HotelModels hotel) {
		// TODO Auto-generated method stub
		for(int i=0;i<hotels.size();i++) {
			HotelModels h=hotels.get(i);
			if(h.getId().equals(Id)){
				hotels.set(i, hotel);
				return;
				
			}
		}
	}

	public void deletehotel(String Id) {
		// TODO Auto-generated method stub
		hotels.removeIf(t ->t.getId().equals(Id));
}

}