package com.woniuxy.dao;

import com.woniuxy.domain.Voucher;
import com.woniuxy.domain.VoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoucherMapper {
    long countByExample(VoucherExample example);

    int deleteByExample(VoucherExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Voucher record);

    int insertSelective(Voucher record);

    List<Voucher> selectByExample(VoucherExample example);

    Voucher selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByExample(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByPrimaryKeySelective(Voucher record);

    int updateByPrimaryKey(Voucher record);
}