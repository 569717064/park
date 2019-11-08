package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Users;
import com.woniuxy.service.IUsersService;

@Service
public class UserServiceImpl implements IUsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	
	@Transactional
	@Override
	public void save(Users users) {
		usersMapper.insertSelective(users);
	}

	@Transactional
	@Override
	public void delete(Integer uid) {
		usersMapper.deleteByPrimaryKey(uid);
	}

	@Transactional
	@Override
	public void update(Users users) {
		usersMapper.updateByPrimaryKeySelective(users);
	}

	@Transactional(readOnly = true)
	@Override
	public Users findOne(Integer uid) {
		return usersMapper.selectByPrimaryKey(uid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Users> findAll() {
		return usersMapper.selectByExample(null);
	}

}
