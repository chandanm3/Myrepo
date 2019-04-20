package com.auquall.Userrequest.PostDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auquall.Userrequest.Models.Post;

public class PostMapper implements RowMapper<Post> {

	@Override
	public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Post p=new Post();
		p.setId(rs.getLong("Id"));
		p.setTitle(rs.getString("Title"));
		p.setBody(rs.getString("Body"));
		p.setCreateDate(rs.getString("Createdate"));
		return p;
	}

}
