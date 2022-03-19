package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.pojo.Users;
import com.springboot.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	/**
	 * 页面跳转
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Users users){
		this.usersService.insertUser(users);
		return "ok";
	}
	
	/**
	 * 查询用户
	 */
	@RequestMapping("/findByUserAll")
	public String findByUserAll(Model model){
		List<Users> list = this.usersService.findByUserAll();
		model.addAttribute("list", list);
		return "showUser";
	}
	
	/**
	 * 修改用户,根据用户id回显用户数据
	 */
	@RequestMapping("/findByUsersId")
	public String findByUsersId(Integer id,Model model){
		Users uId = this.usersService.findByUsersId(id);
		model.addAttribute("users", uId);
		return "updateUser";
	}
	
	/**
	 * 用户的修改
	 */
	@RequestMapping("/editUser")
	public String editUser(Users users){
		this.usersService.updateUsersById(users);
		return "ok";
	}
	
	/**
	 * 删除用户
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(Integer id){
		this.usersService.deleteUserById(id);
		return "redirect:/users/findByUserAll";
	}
	
	/**	
	 * 用户注册
	 */
	@RequestMapping("/register")
	public String registerUser(Users users){
		this.usersService.registerUser(users);
		return "register";
	}

	/**
	 * 用户登录
	 */
	@RequestMapping("/login")
	public String loginUser(Users users){
		
		return "login";
	}
}
