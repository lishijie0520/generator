package com.genertech.lcm.aircraftinfo.dao;

import com.genertech.lcm.aircraftinfo.dto.RulePartno;
import com.genertech.lcm.aircraftinfo.dto.RulePartnoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RulePartnoMapper {
    int countByExample(RulePartnoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RulePartno record);

    int insertSelective(RulePartno record);

    List<RulePartno> selectByExample(RulePartnoExample example);

    RulePartno selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RulePartno record, @Param("example") RulePartnoExample example);

    int updateByExample(@Param("record") RulePartno record, @Param("example") RulePartnoExample example);

    int updateByPrimaryKeySelective(RulePartno record);

    int updateByPrimaryKey(RulePartno record);
}