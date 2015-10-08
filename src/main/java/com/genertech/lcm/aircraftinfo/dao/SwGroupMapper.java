package com.genertech.lcm.aircraftinfo.dao;

import com.genertech.lcm.aircraftinfo.dto.SwGroup;
import com.genertech.lcm.aircraftinfo.dto.SwGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwGroupMapper {
    int countByExample(SwGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(SwGroup record);

    int insertSelective(SwGroup record);

    List<SwGroup> selectByExample(SwGroupExample example);

    SwGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwGroup record, @Param("example") SwGroupExample example);

    int updateByExample(@Param("record") SwGroup record, @Param("example") SwGroupExample example);

    int updateByPrimaryKeySelective(SwGroup record);

    int updateByPrimaryKey(SwGroup record);
}