package com.woniuxy.domain;

import java.io.Serializable;
import java.util.Set;

public class Parkplace implements Serializable {
    private Integer ppid;

    private Integer parkNum;

    private String photo;

    private String property;

    private Double hourprice;

    private Double dayprice;

    private Double weekprice;

    private Integer status;

    private Integer uid;

    private static final long serialVersionUID = 1L;
    

	public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getParkNum() {
        return parkNum;
    }

    public void setParkNum(Integer parkNum) {
        this.parkNum = parkNum;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public Double getHourprice() {
        return hourprice;
    }

    public void setHourprice(Double hourprice) {
        this.hourprice = hourprice;
    }

    public Double getDayprice() {
        return dayprice;
    }

    public void setDayprice(Double dayprice) {
        this.dayprice = dayprice;
    }

    public Double getWeekprice() {
        return weekprice;
    }

    public void setWeekprice(Double weekprice) {
        this.weekprice = weekprice;
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
		return "Parkplace [ppid=" + ppid + ", parkNum=" + parkNum + ", photo=" + photo + ", property=" + property
				+ ", hourprice=" + hourprice + ", dayprice=" + dayprice + ", weekprice=" + weekprice + ", status="
				+ status + ", uid=" + uid + "]";
	}
    
}