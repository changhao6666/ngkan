package com.springboot.pojo;

public class Users {

	private Integer id;
	private String name; // 姓名
	private Integer age; // 年龄
	private String userName; // 帐号
	private String passWord; // 密码
	private String cellPhoneNumber; // 手机号

	public Users(Integer id, String name, Integer age, String userName, String passWord, String cellPhoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.userName = userName;
		this.passWord = passWord;
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

}
