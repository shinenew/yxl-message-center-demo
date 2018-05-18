package com.kingxunlian.message.biz.service;

import com.kingxunlian.message.biz.dto.MessageLog;

import java.util.List;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:46
 */
public interface IMessageService {

        List<MessageLog> findMsgLog();
}
