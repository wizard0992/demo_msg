package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Menu;
import com.wizard.msg.dao.Sys_MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_MenuMapper {
    long countByExample(Sys_MenuExample example);

    int deleteByExample(Sys_MenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(Sys_Menu record);

    int insertSelective(Sys_Menu record);

    List<Sys_Menu> selectByExample(Sys_MenuExample example);

    Sys_Menu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") Sys_Menu record, @Param("example") Sys_MenuExample example);

    int updateByExample(@Param("record") Sys_Menu record, @Param("example") Sys_MenuExample example);

    int updateByPrimaryKeySelective(Sys_Menu record);

    int updateByPrimaryKey(Sys_Menu record);
}