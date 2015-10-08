package com.genertech.lcm.biz.dao;

import com.genertech.lcm.biz.dto.DdmProc;
import com.genertech.lcm.biz.dto.DdmProcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdmProcMapper {
    int countByExample(DdmProcExample example);

    int deleteByExample(DdmProcExample example);

    int deleteByPrimaryKey(String id);

    int insert(DdmProc record);

    int insertSelective(DdmProc record);

    List<DdmProc> selectByExample(DdmProcExample example);

    DdmProc selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DdmProc record, @Param("example") DdmProcExample example);

    int updateByExample(@Param("record") DdmProc record, @Param("example") DdmProcExample example);

    int updateByPrimaryKeySelective(DdmProc record);

    int updateByPrimaryKey(DdmProc record);
}