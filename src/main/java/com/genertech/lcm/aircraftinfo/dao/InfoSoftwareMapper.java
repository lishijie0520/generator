package com.genertech.lcm.aircraftinfo.dao;

import com.genertech.lcm.aircraftinfo.dto.InfoSoftware;
import com.genertech.lcm.aircraftinfo.dto.InfoSoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoSoftwareMapper {
    int countByExample(InfoSoftwareExample example);

    int deleteByPrimaryKey(String id);

    int insert(InfoSoftware record);

    int insertSelective(InfoSoftware record);

    List<InfoSoftware> selectByExample(InfoSoftwareExample example);

    InfoSoftware selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InfoSoftware record, @Param("example") InfoSoftwareExample example);

    int updateByExample(@Param("record") InfoSoftware record, @Param("example") InfoSoftwareExample example);

    int updateByPrimaryKeySelective(InfoSoftware record);

    int updateByPrimaryKey(InfoSoftware record);
}