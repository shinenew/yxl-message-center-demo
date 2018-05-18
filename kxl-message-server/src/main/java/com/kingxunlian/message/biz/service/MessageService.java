package com.kingxunlian.message.biz.service;

import com.kingxunlian.message.biz.dao.DemoDao;
import com.kingxunlian.message.biz.dto.MessageLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:46
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MessageService implements IMessageService{

    @Autowired
    private DemoDao demoDao;

    /**
     * 测试demo
     */
    public List<MessageLog> findMsgLog(){
        List<MessageLog> log = demoDao.findMsgLog();
        return log ;
    }


}
