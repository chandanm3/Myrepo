package com.auquall.Hoteldatabase.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auquall.Hoteldatabase.Models.HotelModels;

@RestController
@RequestMapping("/Controller")
public class HotelController {
	
@Resource
public HotelService hotelservice;

@GetMapping(value="/getAll")
public List<HotelModels> gethotel(){
	return hotelservice.findAll();
}

@PostMapping(value="/addhotel")
public void addhotel(@RequestBody HotelModels hotel) {
	hotelservice.addhotel(hotel);
}

@PutMapping(value = "/updatehotel")
public void updatehotel(@RequestBody HotelModels hotel,@PathVariable String Id) {
	hotelservice.updatehotel(Id,hotel);
}

@DeleteMapping(value="/deletehotel/{Id}")
public void deletehotel(@PathVariable String Id) {
	hotelservice.deletehotel(Id);
}



}
