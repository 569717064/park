package com.woniuxy.domain;

import java.io.Serializable;

public class Comments implements Serializable {
    private Integer cid;

    private String info;

    private Integer status;

    private Integer uid;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", info=" + info + ", status=" + status + ", uid=" + uid + "]";
	}
    
}