package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Parkplace;

public interface IParkplaceService {
	void save(Parkplace parkplace);
	void delete(Integer ppid);
	void update(Parkplace parkplace);
	Parkplace findOne(Integer ppid);
	List<Parkplace> findAll();
	Parkplace findsome(Integer ppid);
}
