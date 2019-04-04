package com.auquall.Hoteldatabase.Dao;

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

import com.auquall.Hoteldatabase.Models.HotelModels;

@Repository
public class HotelRepo implements HotelDao {

	public HotelRepo(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
	NamedParameterJdbcTemplate template;
	@Override
	public List<HotelModels> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from hotel_details",new HotelrowMapper());
	}

	@Override
	public void addhotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		final String sql = "insert into Hotel_Details(Id,H_Name,Address,Mobile,Email) values(:Id,:H_Name,:Address,:Mobile,:Email)";
		 KeyHolder holder = new GeneratedKeyHolder();
		  SqlParameterSource param = new MapSqlParameterSource()
				  .addValue("Id", hotel.getId())

				  .addValue("H_Name", hotel.getName())

				  .addValue("Address", hotel.getAddress())

				  .addValue("Mobile", hotel.getMobile())
		          .addValue("Email", hotel.getEmail());

				          template.update(sql,param, holder);
	}

	@Override
	public void updatehotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		final String sql = "update Hotel_Details set Id=:Id, H_Name=:H_Name, Address=:Address, Mobile=:Mobile, Email=:Email where Id=:Id";
		Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("Id", hotel.getId());
		 map.put("H_Name", hotel.getName());
		 map.put("Address", hotel.getAddress());
		 map.put("Mobile", hotel.getMobile());
		 map.put("Email", hotel.getEmail());
		 
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
}); 
	}

	@Override
	public void deletehotel(HotelModels hotel) {
		// TODO Auto-generated method stub
		 final String sql = "delete from Hotel_Details where Id=:Id";

		 Map<String,Object> map=new HashMap<String,Object>();  

		 map.put("Id", hotel.getId());

		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  

		    @Override  

		    public Object doInPreparedStatement(PreparedStatement ps)  

		            throws SQLException, DataAccessException {  

		        return ps.executeUpdate();  

		    }  

		});  



	}



	}

