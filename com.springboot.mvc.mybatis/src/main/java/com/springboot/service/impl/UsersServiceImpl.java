package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.mapper.UsersMapper;
import com.springboot.pojo.Users;
import com.springboot.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	
	@Override
	public void insertUser(Users users) {
		this.usersMapper.insertUser(users);
	}


	@Override
	public List<Users> findByUserAll() {
		return this.usersMapper.selectUsersAll();
	}


	@Override
	public Users findByUsersId(Integer id) {
		return this.usersMapper.selectUsersById(id);
	}


	@Override
	public void updateUsersById(Users users) {
		this.usersMapper.updateUsersById(users);
	}


	@Override
	public void deleteUserById(Integer id) {
		this.usersMapper.deleteUserById(id);
	}


	@Override
	public void registerUser(Users users) {
		this.usersMapper.registerUser(users);
	}


	
	
}
