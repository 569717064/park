package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ParkplaceMapper;
import com.woniuxy.domain.Parkplace;
import com.woniuxy.service.IParkplaceService;

@Service
public class ParkplaceServiceImpl implements IParkplaceService {

	@Autowired
	private ParkplaceMapper parkplaceMapper;
	
	@Transactional
	@Override
	public void save(Parkplace parkplace) {
		parkplaceMapper.insertSelective(parkplace);
	}

	@Transactional
	@Override
	public void delete(Integer ppid) {
		parkplaceMapper.deleteByPrimaryKey(ppid);
	}

	@Transactional
	@Override
	public void update(Parkplace parkplace) {
		parkplaceMapper.updateByPrimaryKeySelective(parkplace);
	}

	@Transactional(readOnly = true)
	@Override
	public Parkplace findOne(Integer ppid) {
		return parkplaceMapper.selectByPrimaryKey(ppid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Parkplace> findAll() {
		return parkplaceMapper.selectByExample(null);
	}

}
