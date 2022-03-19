package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.mapper") // @MapperScan 用于扫描mybatis的接口mapper
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}


