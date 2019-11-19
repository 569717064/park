package com.woniuxy.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Users;

@RestController
@RequestMapping
public class LoginController {

	@RequestMapping("/login")
	public void login(@RequestBody Users user) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
		subject.login(token);

	}

	@RequestMapping("/isLogin")
	public Map<String, Object> isLogin() {
		Subject subject = SecurityUtils.getSubject();
		Map map = new HashMap<>();

		map.put("isLogin", subject.isAuthenticated());

		return map;
	}

	@RequestMapping("/logout")
	public void logout() {

		Subject subject = SecurityUtils.getSubject();
		subject.logout();
	}

}
