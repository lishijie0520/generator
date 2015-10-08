package com.genertech.lcm.biz.dao;

import com.genertech.lcm.biz.dto.LseSwStatus;
import com.genertech.lcm.biz.dto.LseSwStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LseSwStatusMapper {
    int countByExample(LseSwStatusExample example);

    int deleteByExample(LseSwStatusExample example);

    int deleteByPrimaryKey(String swId);

    int insert(LseSwStatus record);

    int insertSelective(LseSwStatus record);

    List<LseSwStatus> selectByExample(LseSwStatusExample example);

    LseSwStatus selectByPrimaryKey(String swId);

    int updateByExampleSelective(@Param("record") LseSwStatus record, @Param("example") LseSwStatusExample example);

    int updateByExample(@Param("record") LseSwStatus record, @Param("example") LseSwStatusExample example);

    int updateByPrimaryKeySelective(LseSwStatus record);

    int updateByPrimaryKey(LseSwStatus record);
}