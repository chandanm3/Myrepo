package com.auquall.Userrequest.DAO;

import java.util.List;

import com.auquall.Userrequest.Models.UserModels;

public interface Userdao {
	public List<UserModels> findAll();
	public void adduser(UserModels user);
	public void updateuser(UserModels user);
	public void deleteuser(String Id);
    public UserModels getuser(String Id);

}
