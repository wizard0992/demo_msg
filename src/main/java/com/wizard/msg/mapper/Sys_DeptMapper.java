package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Dept;
import com.wizard.msg.dao.Sys_DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_DeptMapper {
    long countByExample(Sys_DeptExample example);

    int deleteByExample(Sys_DeptExample example);

    int deleteByPrimaryKey(Long deptId);

    int insert(Sys_Dept record);

    int insertSelective(Sys_Dept record);

    List<Sys_Dept> selectByExample(Sys_DeptExample example);

    Sys_Dept selectByPrimaryKey(Long deptId);

    int updateByExampleSelective(@Param("record") Sys_Dept record, @Param("example") Sys_DeptExample example);

    int updateByExample(@Param("record") Sys_Dept record, @Param("example") Sys_DeptExample example);

    int updateByPrimaryKeySelective(Sys_Dept record);

    int updateByPrimaryKey(Sys_Dept record);
}