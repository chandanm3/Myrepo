package com.auquall.Userrequest.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auquall.Userrequest.Models.UserModels;

@RestController
public class UserController {
	
	@Resource
    UserService service;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<UserModels> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public void adduser(@RequestBody UserModels user) {
		service.adduser(user);
	}
	
	@RequestMapping(value = "/updateuser", method=RequestMethod.PUT)
	public void updateuser(@RequestBody UserModels user) {
		service.updateuser(user);
	}
	
	@RequestMapping(value="/deleteuser/{Id}", method=RequestMethod.DELETE)
	public void deleteuser(@PathVariable String Id) {
		service.deleteuser(Id);
	}
    public UserModels gethotels(@PathVariable String Id) {
    	return service.gethotels(Id);
    }

}
