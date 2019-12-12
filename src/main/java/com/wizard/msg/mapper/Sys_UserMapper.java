package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_User;
import com.wizard.msg.dao.Sys_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_UserMapper {
    long countByExample(Sys_UserExample example);

    int deleteByExample(Sys_UserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(Sys_User record);

    int insertSelective(Sys_User record);

    List<Sys_User> selectByExample(Sys_UserExample example);

    Sys_User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") Sys_User record, @Param("example") Sys_UserExample example);

    int updateByExample(@Param("record") Sys_User record, @Param("example") Sys_UserExample example);

    int updateByPrimaryKeySelective(Sys_User record);

    int updateByPrimaryKey(Sys_User record);
}