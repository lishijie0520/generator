package com.genertech.lcm.biz.dao;

import com.genertech.lcm.biz.dto.InfoDev;
import com.genertech.lcm.biz.dto.InfoDevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoDevMapper {
    int countByExample(InfoDevExample example);

    int deleteByPrimaryKey(String devId);

    int insert(InfoDev record);

    int insertSelective(InfoDev record);

    List<InfoDev> selectByExample(InfoDevExample example);

    InfoDev selectByPrimaryKey(String devId);

    int updateByExampleSelective(@Param("record") InfoDev record, @Param("example") InfoDevExample example);

    int updateByExample(@Param("record") InfoDev record, @Param("example") InfoDevExample example);

    int updateByPrimaryKeySelective(InfoDev record);

    int updateByPrimaryKey(InfoDev record);
}