package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Permissions;

public interface IPermissionsService {
	void save(Permissions permissions);
	void delete(Integer pid);
	void update(Permissions permissions);
	Permissions findOne(Integer pid);
	List<Permissions> findAll();
}
