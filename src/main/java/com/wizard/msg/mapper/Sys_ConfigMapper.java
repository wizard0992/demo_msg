package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Config;
import com.wizard.msg.dao.Sys_ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_ConfigMapper {
    long countByExample(Sys_ConfigExample example);

    int deleteByExample(Sys_ConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_Config record);

    int insertSelective(Sys_Config record);

    List<Sys_Config> selectByExample(Sys_ConfigExample example);

    Sys_Config selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_Config record, @Param("example") Sys_ConfigExample example);

    int updateByExample(@Param("record") Sys_Config record, @Param("example") Sys_ConfigExample example);

    int updateByPrimaryKeySelective(Sys_Config record);

    int updateByPrimaryKey(Sys_Config record);
}