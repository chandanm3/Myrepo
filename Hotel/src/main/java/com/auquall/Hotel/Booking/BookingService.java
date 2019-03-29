package com.auquall.Hotel.Booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.auquall.Hotel.Booking.BookingModels;

@Service
public class BookingService {
	private List<BookingModels> books=new ArrayList<>(Arrays.asList());    
    
	public List<BookingModels> getbooking()
	{
		return books;
	}

	public BookingModels getbook(String Id) {
	  return books.stream().filter(t ->t.getId().equals(Id)).findFirst().get();
		
	}

	public void addbooking(BookingModels book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	public void updatebooking(String Id, BookingModels book) {
		// TODO Auto-generated method stub
		for(int i=0;i<books.size();i++) {
			BookingModels h=books.get(i);
			if(h.getId().equals(Id)){
				books.set(i, book);
				return;
				
			}
		}
	}

	public void deletebooking(String Id) {
		// TODO Auto-generated method stub
		books.removeIf(t ->t.getId().equals(Id));
	}


}
