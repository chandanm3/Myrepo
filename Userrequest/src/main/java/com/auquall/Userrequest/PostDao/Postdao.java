package com.auquall.Userrequest.PostDao;

import java.util.List;

import com.auquall.Userrequest.Models.Post;

public interface Postdao {

	public List<Post> findAll();
	public void addpost(Post post);
	public void updatepost(Post post);
	public void deletepost(String Id);
    public Post getpost(String Id);
}
