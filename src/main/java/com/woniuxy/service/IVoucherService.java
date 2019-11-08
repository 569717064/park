package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Voucher;

public interface IVoucherService {
	void save(Voucher voucher);
	void delete(Integer vid);
	void update(Voucher voucher);
	Voucher findOne(Integer vid);
	List<Voucher> findAll();
}
