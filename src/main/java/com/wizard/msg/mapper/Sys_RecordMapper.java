package com.wizard.msg.mapper;

import com.wizard.msg.dao.Sys_Record;
import com.wizard.msg.dao.Sys_RecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_RecordMapper {
    long countByExample(Sys_RecordExample example);

    int deleteByExample(Sys_RecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sys_Record record);

    int insertSelective(Sys_Record record);

    List<Sys_Record> selectByExample(Sys_RecordExample example);

    Sys_Record selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sys_Record record, @Param("example") Sys_RecordExample example);

    int updateByExample(@Param("record") Sys_Record record, @Param("example") Sys_RecordExample example);

    int updateByPrimaryKeySelective(Sys_Record record);

    int updateByPrimaryKey(Sys_Record record);
}