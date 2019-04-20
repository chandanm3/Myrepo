package com.auquall.Userrequest.PostDao;

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
import com.auquall.Userrequest.Models.Post;


@Repository
public class PostRepo implements Postdao {
	
	public PostRepo(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
	NamedParameterJdbcTemplate template;

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from post_details",new PostrowMapper());
	}

	@Override
	public void addpost(Post post) {
		// TODO Auto-generated method stub
		final String sql = "insert into Post_Details(Id,Title,Body,Createdate) values(:Id,:Title,:Body,:Createdate)";
		 KeyHolder holder = new GeneratedKeyHolder();
		  SqlParameterSource param = new MapSqlParameterSource()
				  .addValue("Id", post.getId())
				  .addValue("Title", post.getTitle())
				  .addValue("Body", post.getBody())
				  .addValue("Createdate", post.getCreateDate());
				  template.update(sql,param, holder);

	}

	@Override
	public void updatepost(Post post) {
		// TODO Auto-generated method stub
		final String sql = "update Post_Details set Id=:Id, Title=:Title, Body=:Body where Id=:Id";
		Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("Id", post.getId());
		 map.put("Title", post.getTitle());
		 map.put("Body", post.getBody());
			
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
}); 

	}

	@Override
	public void deletepost(String Id) {
		// TODO Auto-generated method stub
		String sql = "delete from Post_Details where Id=:Id";
		  SqlParameterSource namedParameters = new MapSqlParameterSource("Id", String.valueOf(Id));
		  template.update(sql, namedParameters);
	}

	@Override
	public Post getpost(String Id) {
		// TODO Auto-generated method stub
		return template.queryForObject("select * from Post_Details where Id=:Id",new MapSqlParameterSource("Id",Id),new PostMapper());
		 
	}

}
