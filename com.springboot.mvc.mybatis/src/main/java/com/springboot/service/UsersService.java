package com.springboot.service;

import java.util.List;

import com.springboot.pojo.Users;

public interface UsersService {
	
	void insertUser(Users users);
	
	List<Users> findByUserAll();
	
	Users findByUsersId(Integer id);
	
	void updateUsersById(Users users);
	
	void deleteUserById(Integer id);

	void registerUser(Users users);
}
