package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Role_Dept;
import com.wizard.msg.dao.Sys_Role_DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_Role_DeptMapper {
    long countByExample(Sys_Role_DeptExample example);

    int deleteByExample(Sys_Role_DeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_Role_Dept record);

    int insertSelective(Sys_Role_Dept record);

    List<Sys_Role_Dept> selectByExample(Sys_Role_DeptExample example);

    Sys_Role_Dept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_Role_Dept record, @Param("example") Sys_Role_DeptExample example);

    int updateByExample(@Param("record") Sys_Role_Dept record, @Param("example") Sys_Role_DeptExample example);

    int updateByPrimaryKeySelective(Sys_Role_Dept record);

    int updateByPrimaryKey(Sys_Role_Dept record);
}