package com.kingxunlian.message.biz.mapper;

import com.kingxunlian.message.biz.dto.MessageLog;

public interface MessageLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MessageLog record);

    int insertSelective(MessageLog record);

    MessageLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MessageLog record);

    int updateByPrimaryKey(MessageLog record);
}