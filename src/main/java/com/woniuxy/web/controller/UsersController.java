package com.woniuxy.web.controller;

import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Users;
import com.woniuxy.service.IUsersService;

@RestController
@RequestMapping("users")
public class UsersController {

	@Autowired
	private IUsersService usersServiceImpl;
	
	@PostMapping
	public void save() {
		
	}
	
	@DeleteMapping
	public void delete() {
		
	}
	
	@PutMapping
	public void update() {
		
	}
	
	@GetMapping
	public List<Users> findAll(){
		return null;
	}
	
	/**
	 * 根据UId查看自己的信息
	 * @param uid
	 * @return
	 */
	@GetMapping("{uid}")
	public Users findOne(@RequestBody Integer uid) {
		Users users = usersServiceImpl.findOne(uid);
		return users;
	}
	
	/**
	 * 注册
	 * @return
	 */
	@RequestMapping("register")
	public  boolean register(@RequestBody Users users) {
		boolean exist = usersServiceImpl.isExist(users.getUsername());
		if(exist) {
			return false;
		}
		SimpleHash sh = new SimpleHash("MD5",users.getPassword(), "abc", 1024);
		String hex = sh.toHex();
		users.setSalt("abc");
		users.setPassword(hex);
		usersServiceImpl.save(users);
		return true;
	}
}
