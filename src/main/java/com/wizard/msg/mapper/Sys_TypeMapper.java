package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Type;
import com.wizard.msg.dao.Sys_TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_TypeMapper {
    long countByExample(Sys_TypeExample example);

    int deleteByExample(Sys_TypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Sys_Type record);

    int insertSelective(Sys_Type record);

    List<Sys_Type> selectByExample(Sys_TypeExample example);

    Sys_Type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Sys_Type record, @Param("example") Sys_TypeExample example);

    int updateByExample(@Param("record") Sys_Type record, @Param("example") Sys_TypeExample example);

    int updateByPrimaryKeySelective(Sys_Type record);

    int updateByPrimaryKey(Sys_Type record);
}