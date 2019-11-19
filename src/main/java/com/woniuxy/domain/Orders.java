package com.woniuxy.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer oid;

    private Integer uid;

    private Integer ppid;

    private Date datetime;

    private Date startTime;

    private Date endTime;

    private Double price;

    private Integer status;

    private Integer uuid;

    private static final long serialVersionUID = 1L;
    

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", uid=" + uid + ", ppid=" + ppid + ", datetime=" + datetime + ", startTime="
				+ startTime + ", endTime=" + endTime + ", price=" + price + ", status=" + status + ", uuid=" + uuid
				+ "]";
	}
    
}