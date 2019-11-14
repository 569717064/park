package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Users;

public interface IUsersService {
	void save(Users users);
	void delete(Integer uid);
	void update(Users users);
	Users findOne(Integer uid);
	List<Users> findAll();
	//判断注册账号是否存在
	boolean isExist(String username);
}
