package com.genertech.lcm.aircraftinfo.dao;

import com.genertech.lcm.aircraftinfo.dto.certDetail;
import com.genertech.lcm.aircraftinfo.dto.certDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface certDetailMapper {
    int countByExample(certDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(certDetail record);

    int insertSelective(certDetail record);

    List<certDetail> selectByExample(certDetailExample example);

    certDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") certDetail record, @Param("example") certDetailExample example);

    int updateByExample(@Param("record") certDetail record, @Param("example") certDetailExample example);

    int updateByPrimaryKeySelective(certDetail record);

    int updateByPrimaryKey(certDetail record);
}