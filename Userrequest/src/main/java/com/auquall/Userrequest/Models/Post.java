package com.auquall.Userrequest.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {

	private Long Id;
	private String Title;
	private String Body;
	private String createDate;
	Date date=new Date();
		public Post() {
		
	}
	
	public Post(Long id, String title, String body, String createDate) {
		super();
		Id = id;
		Title = title;
		Body = body;
		this.createDate = createDate;
		}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public String getCreateDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 createDate= formatter.format(date);	
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	

	
}
