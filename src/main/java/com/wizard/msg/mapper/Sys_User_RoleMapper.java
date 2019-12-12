package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_User_Role;
import com.wizard.msg.dao.Sys_User_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_RoleMapper {
    long countByExample(Sys_User_RoleExample example);

    int deleteByExample(Sys_User_RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_User_Role record);

    int insertSelective(Sys_User_Role record);

    List<Sys_User_Role> selectByExample(Sys_User_RoleExample example);

    Sys_User_Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_User_Role record, @Param("example") Sys_User_RoleExample example);

    int updateByExample(@Param("record") Sys_User_Role record, @Param("example") Sys_User_RoleExample example);

    int updateByPrimaryKeySelective(Sys_User_Role record);

    int updateByPrimaryKey(Sys_User_Role record);
}