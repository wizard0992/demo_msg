package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Dict;
import com.wizard.msg.dao.Sys_DictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_DictMapper {
    long countByExample(Sys_DictExample example);

    int deleteByExample(Sys_DictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_Dict record);

    int insertSelective(Sys_Dict record);

    List<Sys_Dict> selectByExample(Sys_DictExample example);

    Sys_Dict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_Dict record, @Param("example") Sys_DictExample example);

    int updateByExample(@Param("record") Sys_Dict record, @Param("example") Sys_DictExample example);

    int updateByPrimaryKeySelective(Sys_Dict record);

    int updateByPrimaryKey(Sys_Dict record);
}