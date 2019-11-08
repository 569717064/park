package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.VoucherMapper;
import com.woniuxy.domain.Voucher;
import com.woniuxy.service.IVoucherService;

@Service
public class VoucherServiceImpl implements IVoucherService {

	@Autowired
	private VoucherMapper voucherMapper;
	
	@Transactional
	@Override
	public void save(Voucher voucher) {
		voucherMapper.insertSelective(voucher);
	}

	@Transactional
	@Override
	public void delete(Integer vid) {
		voucherMapper.deleteByPrimaryKey(vid);
	}

	@Transactional
	@Override
	public void update(Voucher voucher) {
		voucherMapper.updateByPrimaryKeySelective(voucher);
	}

	@Transactional(readOnly = true)
	@Override
	public Voucher findOne(Integer vid) {
		return voucherMapper.selectByPrimaryKey(vid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Voucher> findAll() {
		return voucherMapper.selectByExample(null);
	}

}
