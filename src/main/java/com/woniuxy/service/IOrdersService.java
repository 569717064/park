package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Orders;

public interface IOrdersService {
	void save(Orders orders);
	void delete(Integer oid);
	void update(Orders orders);
	Orders findOne(Integer oid);
	List<Orders> findAll();
	List<Orders> findsome(Integer uid);
}
