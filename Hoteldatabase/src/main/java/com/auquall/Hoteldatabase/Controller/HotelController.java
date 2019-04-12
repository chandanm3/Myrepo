package com.auquall.Hoteldatabase.Controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auquall.Hoteldatabase.Models.HotelModels;

@RestController
public class HotelController {
	
@Resource
public HotelService hotelservice;

@RequestMapping(value="/getAll", method=RequestMethod.GET)
public List<HotelModels> gethotel(){
	return hotelservice.findAll();
}

@RequestMapping(value="/get/{Id}", method=RequestMethod.GET)
public HotelModels gethotels(@PathVariable String Id) {
	return hotelservice.gethotels(Id);
}

@RequestMapping(value="/addhotel", method=RequestMethod.POST)
public void addhotel(@RequestBody HotelModels hotel) {
	hotelservice.addhotel(hotel);
}

@RequestMapping(value = "/updatehotel", method=RequestMethod.PUT)
public void updatehotel(@RequestBody HotelModels hotel) {
	hotelservice.updatehotel(hotel);
}

@RequestMapping(value="/deletehotel/{Id}", method=RequestMethod.DELETE)
public void deletehotel(@PathVariable String Id) {
	hotelservice.deletehotel(Id);
	}
}
