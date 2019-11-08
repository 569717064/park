package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Roles;

public interface IRolesService {
	void save(Roles roles);
	void delete(Integer rid);
	void update(Roles roles);
	Roles findOne(Integer rid);
	List<Roles> findAll();
}
