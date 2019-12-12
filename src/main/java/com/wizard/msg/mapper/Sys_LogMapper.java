package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Log;
import com.wizard.msg.dao.Sys_LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_LogMapper {
    long countByExample(Sys_LogExample example);

    int deleteByExample(Sys_LogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sys_Log record);

    int insertSelective(Sys_Log record);

    List<Sys_Log> selectByExample(Sys_LogExample example);

    Sys_Log selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sys_Log record, @Param("example") Sys_LogExample example);

    int updateByExample(@Param("record") Sys_Log record, @Param("example") Sys_LogExample example);

    int updateByPrimaryKeySelective(Sys_Log record);

    int updateByPrimaryKey(Sys_Log record);
}