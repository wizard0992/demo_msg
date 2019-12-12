package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Post;
import com.wizard.msg.dao.Sys_PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_PostMapper {
    long countByExample(Sys_PostExample example);

    int deleteByExample(Sys_PostExample example);

    int deleteByPrimaryKey(Long postId);

    int insert(Sys_Post record);

    int insertSelective(Sys_Post record);

    List<Sys_Post> selectByExample(Sys_PostExample example);

    Sys_Post selectByPrimaryKey(Long postId);

    int updateByExampleSelective(@Param("record") Sys_Post record, @Param("example") Sys_PostExample example);

    int updateByExample(@Param("record") Sys_Post record, @Param("example") Sys_PostExample example);

    int updateByPrimaryKeySelective(Sys_Post record);

    int updateByPrimaryKey(Sys_Post record);
}