package com.pinyougou.sellergoods.service;

import com.wwh.pojo.Mail;
import com.wwh.pojo.Mailvo;
import com.wwh.pojo.User;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
public interface MailService {

    public User login(User user);


    public List<Mailvo> list();


    public void dele(Integer id);


    public void add(Mail mail);


    public void df(Mail mail);
}
