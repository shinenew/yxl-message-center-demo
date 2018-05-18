package com.kingxunlian.message.biz.dao;

import com.kingxunlian.message.biz.dto.MessageLog;
import com.kingxunlian.message.biz.mapper.DemoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:48
 */
@Component
public class DemoDao {

    private static final Logger logger = LoggerFactory.getLogger(DemoDao.class);

    @Autowired
    private DemoMapper demoMapper;

    public List<MessageLog> findMsgLog(){
        List<MessageLog> log =  demoMapper.findMsgLog();
        return log;
    }

}
