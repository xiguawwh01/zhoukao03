package com.wwh.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public class Lists implements Serializable{

   private List list;
    private Object user;

    public List getList() {
        return list;
    }

    public Lists setList(List list) {
        this.list = list;
        return this;
    }

    public Object getUser() {
        return user;
    }

    public Lists setUser(Object user) {
        this.user = user;
        return this;
    }
}
