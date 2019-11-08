package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.LogsMapper;
import com.woniuxy.domain.Logs;
import com.woniuxy.service.ILogsService;

@Service
public class LogsServiceImpl implements ILogsService {

	@Autowired
	private LogsMapper logsMapper;
	
	
	@Transactional
	@Override
	public void save(Logs logs) {
		logsMapper.insertSelective(logs);
	}

	@Transactional
	@Override
	public void delete(Integer lid) {
		logsMapper.deleteByPrimaryKey(lid);
	}

	@Transactional
	@Override
	public void update(Logs logs) {
		logsMapper.updateByPrimaryKeySelective(logs);
	}

	@Transactional(readOnly = true)
	@Override
	public Logs findOne(Integer lid) {
		return logsMapper.selectByPrimaryKey(lid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Logs> findAll() {
		return logsMapper.selectByExample(null);
	}

}
