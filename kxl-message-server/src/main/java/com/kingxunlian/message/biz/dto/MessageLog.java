package com.kingxunlian.message.biz.dto;

import java.io.Serializable;
import java.util.Date;

public class MessageLog implements Serializable {
    private Long id;

    private Date logTime;

    private String logDesc;

    private Byte logType;

    private Long logRel;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getLogRel() {
        return logRel;
    }

    public void setLogRel(Long logRel) {
        this.logRel = logRel;
    }
}