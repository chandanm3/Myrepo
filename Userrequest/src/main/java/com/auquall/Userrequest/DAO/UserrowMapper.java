package com.auquall.Userrequest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auquall.Userrequest.Models.UserModels;

public class UserrowMapper implements RowMapper<UserModels> {

	@Override
	public UserModels mapRow(ResultSet rs,int arg) throws SQLException
	{
		UserModels u=new UserModels();
		u.setId(rs.getString("Id"));
		u.setName(rs.getString("Name"));
		u.setDOB(rs.getString("DOB"));
		u.setAddress(rs.getString("Address"));
		u.setMobile(rs.getString("Mobile"));
		u.setEmail(rs.getString("Email"));
		u.setPassword(rs.getString("Password"));
		return u;
	}
}
