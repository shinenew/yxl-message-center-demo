package com.kingxunlian.message.biz.controller;

import com.kingxunlian.message.biz.dto.MessageLog;
import com.kingxunlian.message.biz.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:47
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private IMessageService messageService;


    /**
     * 测试demo
     */
    @RequestMapping(value = "/findMsgLog",method = RequestMethod.GET)
    public List<MessageLog> findMsgLog(){
        List<MessageLog> log = this.messageService.findMsgLog();
        return log;
    }
}
