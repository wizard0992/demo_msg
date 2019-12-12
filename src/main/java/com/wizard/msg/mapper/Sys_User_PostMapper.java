package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_User_Post;
import com.wizard.msg.dao.Sys_User_PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_PostMapper {
    long countByExample(Sys_User_PostExample example);

    int deleteByExample(Sys_User_PostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys_User_Post record);

    int insertSelective(Sys_User_Post record);

    List<Sys_User_Post> selectByExample(Sys_User_PostExample example);

    Sys_User_Post selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys_User_Post record, @Param("example") Sys_User_PostExample example);

    int updateByExample(@Param("record") Sys_User_Post record, @Param("example") Sys_User_PostExample example);

    int updateByPrimaryKeySelective(Sys_User_Post record);

    int updateByPrimaryKey(Sys_User_Post record);
}