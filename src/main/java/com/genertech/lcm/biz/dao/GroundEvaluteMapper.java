package com.genertech.lcm.biz.dao;

import com.genertech.lcm.biz.dto.GroundEvalute;

public interface GroundEvaluteMapper {
    int deleteByPrimaryKey(String id);

    int insert(GroundEvalute record);

    int insertSelective(GroundEvalute record);

    GroundEvalute selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GroundEvalute record);

    int updateByPrimaryKey(GroundEvalute record);
}