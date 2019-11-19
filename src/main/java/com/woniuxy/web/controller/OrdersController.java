package com.woniuxy.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;

@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	private IOrdersService ordersServiceImpl;
	
	
	@PostMapping
	public void save(@RequestBody Orders orders) {
		ordersServiceImpl.save(orders);
	}
	
	@DeleteMapping
	public void delete(Integer oid) {
		ordersServiceImpl.delete(oid);
	}
	
	@PutMapping
	public void update(@RequestBody Orders orders) {
		ordersServiceImpl.update(orders);
	}
	
	@GetMapping
	public List<Orders> findAll(){
		List<Orders> ordersList = ordersServiceImpl.findAll();
		return ordersList;
	}
	
}
