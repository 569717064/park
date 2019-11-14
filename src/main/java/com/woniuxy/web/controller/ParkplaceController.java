package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Parkplace;
import com.woniuxy.service.IParkplaceService;

@RestController
@RequestMapping("parkplaces")
public class ParkplaceController {

	@Autowired
	private IParkplaceService ParkplaceServiceImpl;
	
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
	public List<Parkplace> findAll(){
		return null;
	}
	
	
	@GetMapping(value="/{ppid}")
	public Parkplace findsome(@PathVariable Integer ppid){
		System.out.println(ParkplaceServiceImpl.findsome(1));
		return ParkplaceServiceImpl.findsome(ppid);
	}
}
