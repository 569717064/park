package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.PermissionsMapper;
import com.woniuxy.domain.Permissions;
import com.woniuxy.service.IPermissionsService;

@Service
public class PermissionsServiceImpl implements IPermissionsService {

	@Autowired
	private PermissionsMapper permissionsMapper;
	
	@Transactional
	@Override
	public void save(Permissions permissions) {
		permissionsMapper.insertSelective(permissions);
	}

	@Transactional
	@Override
	public void delete(Integer pid) {
		permissionsMapper.deleteByPrimaryKey(pid);
	}

	@Transactional
	@Override
	public void update(Permissions permissions) {
		permissionsMapper.updateByPrimaryKeySelective(permissions);
	}

	@Transactional(readOnly = true)
	@Override
	public Permissions findOne(Integer pid) {
		return permissionsMapper.selectByPrimaryKey(pid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Permissions> findAll() {
		return permissionsMapper.selectByExample(null);
	}

}
