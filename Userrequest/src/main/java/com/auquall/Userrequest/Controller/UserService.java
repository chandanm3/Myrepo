package com.auquall.Userrequest.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.auquall.Userrequest.DAO.Userdao;
import com.auquall.Userrequest.Models.UserModels;

@Service
public class UserService {
 

	@Resource 
	Userdao dao;
	
	public List<UserModels> findAll(){
		return dao.findAll();
	}
	public void adduser(UserModels user) {
		dao.adduser(user);
	}
	public void updateuser(UserModels user) {
		dao.updateuser(user);
	}
	public void deleteuser(String Id) {
		dao.deleteuser(Id);
	}
    public UserModels gethotels(String Id) {
    	return dao.getuser(Id);
    }

}
