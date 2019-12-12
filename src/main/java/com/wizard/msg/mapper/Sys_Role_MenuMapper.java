package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Role_Menu;
import com.wizard.msg.dao.Sys_Role_MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_Role_MenuMapper {
    long countByExample(Sys_Role_MenuExample example);

    int deleteByExample(Sys_Role_MenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_Role_Menu record);

    int insertSelective(Sys_Role_Menu record);

    List<Sys_Role_Menu> selectByExample(Sys_Role_MenuExample example);

    Sys_Role_Menu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_Role_Menu record, @Param("example") Sys_Role_MenuExample example);

    int updateByExample(@Param("record") Sys_Role_Menu record, @Param("example") Sys_Role_MenuExample example);

    int updateByPrimaryKeySelective(Sys_Role_Menu record);

    int updateByPrimaryKey(Sys_Role_Menu record);
}