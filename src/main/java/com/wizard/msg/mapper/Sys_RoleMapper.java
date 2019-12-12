package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Role;
import com.wizard.msg.dao.Sys_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_RoleMapper {
    long countByExample(Sys_RoleExample example);

    int deleteByExample(Sys_RoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(Sys_Role record);

    int insertSelective(Sys_Role record);

    List<Sys_Role> selectByExample(Sys_RoleExample example);

    Sys_Role selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") Sys_Role record, @Param("example") Sys_RoleExample example);

    int updateByExample(@Param("record") Sys_Role record, @Param("example") Sys_RoleExample example);

    int updateByPrimaryKeySelective(Sys_Role record);

    int updateByPrimaryKey(Sys_Role record);
}