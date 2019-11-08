package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Logs;

public interface ILogsService {
	void save(Logs logs);
	void delete(Integer lid);
	void update(Logs logs);
	Logs findOne(Integer lid);
	List<Logs> findAll();
}
