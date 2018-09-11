package com.newer.springbootmember2.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private static final long serialVersionUID = -6984523868030794313L;
    private Integer mId;
    private String mName;
    private String mPhone;
    private Integer mLevel;
    private String mCardNo;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mInTime;

    public Member() {
    }

    public Member(Integer mId, String mName, String mPhone, Integer mLevel, String mCardNo, Date mInTime) {
        this.mId = mId;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mLevel = mLevel;
        this.mCardNo = mCardNo;
        this.mInTime = mInTime;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public Integer getmLevel() {
        return mLevel;
    }

    public void setmLevel(Integer mLevel) {
        this.mLevel = mLevel;
    }

    public String getmCardNo() {
        return mCardNo;
    }

    public void setmCardNo(String mCardNo) {
        this.mCardNo = mCardNo;
    }

    public Date getmInTime() {
        return mInTime;
    }

    public void setmInTime(Date mInTime) {
        this.mInTime = mInTime;
    }
}
