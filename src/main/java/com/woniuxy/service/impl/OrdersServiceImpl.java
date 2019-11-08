package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.OrdersMapper;
import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;

@Service
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	
	@Transactional
	@Override
	public void save(Orders orders) {
		ordersMapper.insertSelective(orders);
	}

	@Transactional
	@Override
	public void delete(Integer oid) {
		ordersMapper.deleteByPrimaryKey(oid);
	}

	@Transactional
	@Override
	public void update(Orders orders) {
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	@Transactional(readOnly = true)
	@Override
	public Orders findOne(Integer oid) {
		return ordersMapper.selectByPrimaryKey(oid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Orders> findAll() {
		return ordersMapper.selectByExample(null);
	}

}
