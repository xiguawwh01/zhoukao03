package com.wwh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public class Mail implements Serializable{

    private int mid;
    private String topic;
    private String cont;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sdate;
    private int sta;
    private int fid;
    private int sid;

    public int getMid() {
        return mid;
    }

    public Mail setMid(int mid) {
        this.mid = mid;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public Mail setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getCont() {
        return cont;
    }

    public Mail setCont(String cont) {
        this.cont = cont;
        return this;
    }

    public Date getSdate() {
        return sdate;
    }

    public Mail setSdate(Date sdate) {
        this.sdate = sdate;
        return this;
    }

    public int getSta() {
        return sta;
    }

    public Mail setSta(int sta) {
        this.sta = sta;
        return this;
    }

    public int getFid() {
        return fid;
    }

    public Mail setFid(int fid) {
        this.fid = fid;
        return this;
    }

    public int getSid() {
        return sid;
    }

    public Mail setSid(int sid) {
        this.sid = sid;
        return this;
    }
}
