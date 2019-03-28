package com.auquall.Hotel;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
	@Autowired
	private HotelService hotelservice;
	
	@RequestMapping("/Hotel")
	public List<HotelModels> getAllHotel()
	{
		return hotelservice.gethotels();
	}
	
	@RequestMapping("/Hotel/{Id}")
	public HotelModels getHotel(@PathVariable String Id) {
		return hotelservice.gethotel(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Hotel")
	public void addhotel(@RequestBody @Valid HotelModels hotel) {
		hotelservice.addhotel(hotel);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Hotel/{Id}")
	public void updatehotel(@RequestBody HotelModels hotel,@PathVariable String Id) {
		hotelservice.updatehotel(Id,hotel);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/Hotel/{Id}")
	public void deletehotel(@PathVariable String Id) {
		hotelservice.deletehotel(Id);
	}
}
