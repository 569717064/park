package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Roles;
import com.woniuxy.service.IRolesService;

@RestController
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private IRolesService rolesServiceImpl;
	
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
	public List<Roles> findAll(){
		return null;
	}
}
