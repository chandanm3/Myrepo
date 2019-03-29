package com.auquall.Hotel.Booking;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.auquall.Hotel.Booking.BookingModels;
import com.auquall.Hotel.Booking.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	
	@RequestMapping("/Hotel/Booking")
	public List<BookingModels> getAllBooking()
	{
		return bookingservice.getbooking();
	}
	
	@RequestMapping("/Hotel/Booking/{Id}")
	public BookingModels getBooking(@PathVariable String Id) {
		return bookingservice.getbook(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Hotel/Booking")
	public void addBooking(@RequestBody @Valid BookingModels book) {
		bookingservice.addbooking(book);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Hotel/Booking/{Id}")
	public void updateBooking(@RequestBody BookingModels book,@PathVariable String Id) {
		bookingservice.updatebooking(Id,book);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/Hotel/Booking/{Id}")
	public void deleteBooking(@PathVariable String Id) {
		bookingservice.deletebooking(Id);
	}

}
