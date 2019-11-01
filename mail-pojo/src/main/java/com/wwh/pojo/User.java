package com.wwh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public class User implements Serializable{

    @Field
    private long id;
    @Field("user_uname")
    private String uname;
    @Field("user_pwd")
    private String pwd;
    @Field("user_email")
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date rdate;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUname() {
        return uname;
    }

    public User setUname(String uname) {
        this.uname = uname;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getRdate() {
        return rdate;
    }

    public User setRdate(Date rdate) {
        this.rdate = rdate;
        return this;
    }
}
