package com.springboot.mapper;

import java.util.List;

import com.springboot.pojo.Users;

public interface UsersMapper {
	
	void insertUser(Users users);
	
	List<Users> selectUsersAll();
	
	Users selectUsersById(Integer id);
	
	void updateUsersById(Users users);
	
	void deleteUserById(Integer id);

	void registerUser(Users users);
}
