package com.auquall.Userrequest.Postcotroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auquall.Userrequest.Models.Post;
@RestController
public class PostController {
	@Resource
	PostService postservice;
	
	@RequestMapping(value="/post", method=RequestMethod.GET)
	public List<Post> findAll(){
		return postservice.findAll();
	}
	@RequestMapping(value="/addpost",method=RequestMethod.POST)
	public void addpost(@RequestBody Post post) {
		postservice.addpost(post);
	}
	
	@RequestMapping(value="/updatepost",method=RequestMethod.PUT)
	public void updatepost(@RequestBody Post post) {
		postservice.updatepost(post);
	}
	
	@RequestMapping(value="/deletepost",method=RequestMethod.DELETE)
	public void deletepost(@PathVariable String Id) {
		postservice.deletepost(Id);
	}
	
	@RequestMapping(value="/getpost",method=RequestMethod.GET)
    public Post getpost(@PathVariable String Id) {
		return postservice.getpost(Id);
	}
}
