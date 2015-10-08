package com.genertech.lcm.biz.dao;

import com.genertech.lcm.biz.dto.InfoForbit;

public interface InfoForbitMapper {
    int insert(InfoForbit record);

    int insertSelective(InfoForbit record);
}