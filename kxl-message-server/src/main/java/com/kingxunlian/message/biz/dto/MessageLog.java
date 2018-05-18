package com.kingxunlian.message.biz.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class MessageLog implements Serializable {


    private BigInteger id;

    private Date logTime;

    private String logDesc;

    private Byte logType;

    private BigInteger logRel;

    public MessageLog(){}

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    public Byte getLogType() {
        return logType;
    }

    public void setLogType(Byte logType) {
        this.logType = logType;
    }

    public BigInteger getLogRel() {
        return logRel;
    }

    public void setLogRel(BigInteger logRel) {
        this.logRel = logRel;
    }
}