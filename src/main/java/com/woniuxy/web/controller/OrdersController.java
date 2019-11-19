package com.woniuxy.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("{oid}")
	public void delete(@PathVariable Integer oid) {
		ordersServiceImpl.delete(oid);
	}
	
	@PutMapping
	public void update(@RequestBody Orders orders) {
		ordersServiceImpl.update(orders);
	}
	
	@GetMapping
	public List<Orders> findAll(){
		List<Orders> orders = ordersServiceImpl.findAll();
		return orders;
	}
	
	
	/**
	 * 根据Id获得表单
	 * @param uid
	 * @return
	 */
	@GetMapping("{uid}")
	public List<Orders> ordersList(@PathVariable Integer uid ){
		List<Orders> orders = ordersServiceImpl.ordersFindAllByUid(uid);
		return orders;
	}
	
	
	@GetMapping(value="/{uid}")
	public List<Orders> findsome(@PathVariable Integer uid){
		return ordersServiceImpl.findsome(uid);
	}
	
}
