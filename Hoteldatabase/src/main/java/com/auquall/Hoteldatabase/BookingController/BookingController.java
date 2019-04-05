package com.auquall.Hoteldatabase.BookingController;

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
import com.auquall.Hoteldatabase.Models.BookingModels;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	
	@Resource
	BookingService bookingservice;
	
	@GetMapping(value="/allbooking")
	public List<BookingModels> findAll(){
		return bookingservice.findAll();
	}
	@PostMapping(value="/addbooking")
	public void addbooking(@RequestBody BookingModels book) {
		bookingservice.addbooking(book);
	}
	@PutMapping(value="/updatebooking")
	public void updatebooking(@RequestBody BookingModels book) {
		bookingservice.updatebooking(book);
	}
	@DeleteMapping(value="/deletebooking/{Id}")
	public void deletebooking(@PathVariable String Id) {
		bookingservice.deletebooking(Id);
	}
	@GetMapping(value="/getbooking/{Id}")
    public BookingModels getbooking(@PathVariable String Id) {
		return bookingservice.getbooking(Id);
	}
}
