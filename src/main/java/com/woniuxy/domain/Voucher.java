package com.woniuxy.domain;

import java.io.Serializable;

public class Voucher implements Serializable {
    private Integer vid;

    private String num;

    private Integer uid;

    private Integer uuid;

    private static final long serialVersionUID = 1L;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
}