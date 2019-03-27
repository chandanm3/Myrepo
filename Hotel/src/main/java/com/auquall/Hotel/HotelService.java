package com.auquall.Hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HotelService {
	
	private List<HotelModels> hotels=new ArrayList<>(Arrays.asList( 
		  new HotelModels(1,"Hyatt","New Delhi","9865342345","hyatt@gmail.com"),
          new HotelModels(2,"Taj","Mumbai","8965441520","taj@yahoo.com")
          ));    
          
public List<HotelModels> gethotels()
{
	return hotels;
}

public HotelModels gethotel(int Id) {
  return hotels.get(Id);
	
}

public void addhotel(HotelModels hotel) {
	// TODO Auto-generated method stub
	hotels.add(hotel);
}

public void updatehotel(int Id, HotelModels hotel) {
	// TODO Auto-generated method stub
	for(int i=0;i<hotels.size();i++) {
		HotelModels h=hotels.get(i);
		if(h.equals(hotel)){
			hotels.set(Id, hotel);
			
		}
	}
}

public void deletehotel(int id) {
	// TODO Auto-generated method stub
	hotels.remove(id);
}


}
