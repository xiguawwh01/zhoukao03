package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.MailMapper;
import com.pinyougou.sellergoods.service.MailService;
import com.wwh.pojo.*;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.solr.core.SolrTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
@Service
public class MailServiceImpl implements MailService{
    @Autowired
    private MailMapper mappper;

    @Autowired
    private RedisTemplate redis;
    @Autowired
    private SolrTemplate solrTemplate;
    @Override
    public User login(User user) {


        return mappper.login(user.getUname());
    }

    @Override
    public List<Mailvo> list() {
        List<Mailvo> list = mappper.list();
        String s = JsonListUtil.listToJson(list);
       redis.boundValueOps("list").set(s);
        List<User> li=new ArrayList<User>();
       User u=new User();
       u.setId(1L);
        u.setUname("xiaoming");
        User u2=new User();
        u.setId(2L);
        u2.setUname("xiaoliang");
        li.add(u);
        li.add(u2);
        solrTemplate.saveBeans(li);
        solrTemplate.commit();
        System.out.println(s+"1111111111");
        return list;
    }

    @Override
    public void dele(Integer id) {
        mappper.dele(id);
    }

    @Override
    public void add(Mail mail) {
        mail.setSta(1);
        mail.setSid(2);
        mail.setFid(2);

        mappper.add(mail);
    }

    @Override
    public void df(Mail mail) {
        mappper.df(mail);
    }




}
