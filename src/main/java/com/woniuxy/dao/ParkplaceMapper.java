package com.woniuxy.dao;

import com.woniuxy.domain.Parkplace;
import com.woniuxy.domain.ParkplaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkplaceMapper {
    long countByExample(ParkplaceExample example);

    int deleteByExample(ParkplaceExample example);

    int deleteByPrimaryKey(Integer ppid);

    int insert(Parkplace record);

    int insertSelective(Parkplace record);

    List<Parkplace> selectByExample(ParkplaceExample example);

    Parkplace selectByPrimaryKey(Integer ppid);

    int updateByExampleSelective(@Param("record") Parkplace record, @Param("example") ParkplaceExample example);

    int updateByExample(@Param("record") Parkplace record, @Param("example") ParkplaceExample example);

    int updateByPrimaryKeySelective(Parkplace record);

    int updateByPrimaryKey(Parkplace record);
}