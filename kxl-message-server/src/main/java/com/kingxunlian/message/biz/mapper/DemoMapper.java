package com.kingxunlian.message.biz.mapper;

import com.kingxunlian.message.biz.dto.MessageLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    List<MessageLog> findMsgLog();

}