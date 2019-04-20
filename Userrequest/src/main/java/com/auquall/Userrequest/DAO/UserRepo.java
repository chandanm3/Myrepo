package com.auquall.Userrequest.DAO;

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

import com.auquall.Userrequest.Models.UserModels;
@Repository
public class UserRepo implements Userdao {

	public UserRepo(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
	NamedParameterJdbcTemplate template;
	@Override
	public List<UserModels> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from user_details",new UserrowMapper());
	}

	@Override
	public void adduser(UserModels user) {
		// TODO Auto-generated method stub
		final String sql = "insert into User_Details(Id,Name,DOB,Address,Mobile,Email,Password) values(:Id,:Name,:DOB,:Address,:Mobile,:Email,:Password)";
		 KeyHolder holder = new GeneratedKeyHolder();
		  SqlParameterSource param = new MapSqlParameterSource()
				  .addValue("Id", user.getId())
				  .addValue("Name", user.getName())
				  .addValue("DOB", user.getDOB())
				  .addValue("Address", user.getAddress())
				  .addValue("Mobile", user.getMobile())
		          .addValue("Email", user.getEmail())
		          .addValue("Password", user.getPassword());

				  template.update(sql,param, holder);

	}

	@Override
	public void updateuser(UserModels user) {
		// TODO Auto-generated method stub

		final String sql = "update User_Details set Id=:Id, Name=:Name, DOB=:DOB ,Address=:Address, Mobile=:Mobile, Email=:Email, Password=:Password where Id=:Id";
				Map<String,Object> map=new HashMap<String,Object>();  
				 map.put("Id", user.getId());
				 map.put("Name", user.getName());
				 map.put("DOB", user.getDOB());
				 map.put("Address", user.getAddress());
				 map.put("Mobile", user.getMobile());
				 map.put("Email", user.getEmail());
				 map.put("Password", user.getPassword());
				 
			
				 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
					    @Override  
					    public Object doInPreparedStatement(PreparedStatement ps)  
					            throws SQLException, DataAccessException {  
					        return ps.executeUpdate();  
					    }  
		}); 
	}

	@Override
	public void deleteuser(String Id) {
		// TODO Auto-generated method stub
		  String sql = "delete from User_Details where Id=:Id";
		  SqlParameterSource namedParameters = new MapSqlParameterSource("Id", String.valueOf(Id));
		  template.update(sql, namedParameters);
		
	}

	@Override
	public UserModels getuser(String Id) {
		// TODO Auto-generated method stub
		return template.queryForObject("select * from User_Details where Id=:Id",new MapSqlParameterSource("Id",Id),new userMapper());
		 
	}

}
