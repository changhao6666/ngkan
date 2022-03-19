package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  thymeleaf入门案列
 * @author 22446
 *
 */

@Controller
public class DemoThymeleaf {
	
	@RequestMapping("/{showUrl}")
	public String showMsg(@PathVariable String showUrl,Integer id,String name){
		System.out.println(id+"--"+name);
		return "index";
	}
	
	
}
