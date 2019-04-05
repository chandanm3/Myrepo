package com.auquall.Hoteldatabase.BookingDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.auquall.Hoteldatabase.Models.BookingModels;

@Repository
public class Bookingrepo implements Bookingdao {
	
	public Bookingrepo(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
	NamedParameterJdbcTemplate template;

	@Override
	public List<BookingModels> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from Booking_Details",new BookingrowMapper());
	}

	@Override
	public void addbooking(BookingModels book) {
		// TODO Auto-generated method stub
		final String sql = "insert into Booking_Details(B_Id,H_Name,Checkin,Checkout,Rooms,Adults) values(:B_Id,:H_Name,:Checkin,:Checkout,:Rooms,:Adults)";
		 KeyHolder holder = new GeneratedKeyHolder();
		  SqlParameterSource param = new MapSqlParameterSource()
				  .addValue("B_Id", book.getBId())
				  .addValue("H_Name", book.getName())
				  .addValue("Checkin", book.getCheckin())
				  .addValue("Checkout", book.getCheckout())
		          .addValue("Rooms", book.getRooms())
		          .addValue("Adults", book.getAdults());

				          template.update(sql,param, holder);
	}

	@Override
	public void updatebooking(BookingModels book) {
		// TODO Auto-generated method stub
		final String sql = "update Booking_Details set B_Id=:B_Id, H_Name=:H_Name, Checkin=:Checkin, Checkout=:Checkout, Rooms=:Rooms, Adults=:Adults where B_Id=:B_Id";
		Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("B_Id", book.getBId());
		 map.put("H_Name", book.getName());
		 map.put("Checkin", book.getCheckin());
		 map.put("Checkout", book.getCheckout());
		 map.put("Rooms", book.getRooms());
		 map.put("Adults", book.getAdults());
		 
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
}); 
	}

	@Override
	public void deletebooking(String Id) {
		// TODO Auto-generated method stub
		 String sql = "delete from Booking_Details where B_Id=:B_Id";
		  SqlParameterSource namedParameters = new MapSqlParameterSource("B_Id", String.valueOf(Id));
		  template.update(sql, namedParameters);
		
	}

	@Override
	public BookingModels getbooking(String Id) {
		// TODO Auto-generated method stub
		return template.queryForObject("select * from Booking_Details where B_Id=:B_Id",new MapSqlParameterSource("B_Id",Id),new BookingMapper());
	}

}
