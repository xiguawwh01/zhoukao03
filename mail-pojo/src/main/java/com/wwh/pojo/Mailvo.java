package com.wwh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public class Mailvo implements Serializable{

    @Field
    private long id;

    @Field("mailtop")
    private String topic;
    @Field("mailco")
    private String cont;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Field("mailsd")
    private Date sdate;
    @Field("mailsta")
    private int sta;
    @Field("mailuname")
    private String uname;
    @Field("mailema")
    private String email;
    @Field("mailsuname")
    private String suname;
    @Field("mailsemail")
    private String semail;

    public long getId() {
        return id;
    }

    public Mailvo setId(long id) {
        this.id = id;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public Mailvo setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getCont() {
        return cont;
    }

    public Mailvo setCont(String cont) {
        this.cont = cont;
        return this;
    }

    public Date getSdate() {
        return sdate;
    }

    public Mailvo setSdate(Date sdate) {
        this.sdate = sdate;
        return this;
    }

    public int getSta() {
        return sta;
    }

    public Mailvo setSta(int sta) {
        this.sta = sta;
        return this;
    }

    public String getUname() {
        return uname;
    }

    public Mailvo setUname(String uname) {
        this.uname = uname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Mailvo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSuname() {
        return suname;
    }

    public Mailvo setSuname(String suname) {
        this.suname = suname;
        return this;
    }

    public String getSemail() {
        return semail;
    }

    public Mailvo setSemail(String semail) {
        this.semail = semail;
        return this;
    }
}
