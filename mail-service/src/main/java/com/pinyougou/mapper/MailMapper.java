package com.pinyougou.mapper;

import com.wwh.pojo.Mail;
import com.wwh.pojo.Mailvo;
import com.wwh.pojo.User;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public interface MailMapper {

    public User login(String name);

    public List<Mailvo> list();

    public void dele(Integer id);

    public void add(Mail mail);

    public void df(Mail mail);
}
