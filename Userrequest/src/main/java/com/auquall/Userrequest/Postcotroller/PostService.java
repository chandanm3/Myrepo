package com.auquall.Userrequest.Postcotroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.auquall.Userrequest.Models.Post;
import com.auquall.Userrequest.PostDao.Postdao;

@Service
public class PostService {	
	@Resource
	Postdao postdao;
	
	public List<Post> findAll(){
		return postdao.findAll();
	}
	public void addpost(Post post) {
		// TODO Auto-generated method stub
		postdao.addpost(post);
	}

	public void updatepost(Post post) {
		postdao.updatepost(post);
	}
	public void deletepost(String Id) {
		postdao.deletepost(Id);
	}
    public Post getpost(String Id) {
    	return postdao.getpost(Id);
    }	
}
