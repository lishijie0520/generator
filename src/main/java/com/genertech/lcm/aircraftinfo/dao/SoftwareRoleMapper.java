package com.genertech.lcm.aircraftinfo.dao;

import com.genertech.lcm.aircraftinfo.dto.SoftwareRole;
import com.genertech.lcm.aircraftinfo.dto.SoftwareRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareRoleMapper {
    int countByExample(SoftwareRoleExample example);

    int insert(SoftwareRole record);

    int insertSelective(SoftwareRole record);

    List<SoftwareRole> selectByExample(SoftwareRoleExample example);

    int updateByExampleSelective(@Param("record") SoftwareRole record, @Param("example") SoftwareRoleExample example);

    int updateByExample(@Param("record") SoftwareRole record, @Param("example") SoftwareRoleExample example);
}