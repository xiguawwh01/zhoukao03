package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.sellergoods.service.MailService;
import com.wwh.pojo.Lists;
import com.wwh.pojo.Mail;
import com.wwh.pojo.Mailvo;
import com.wwh.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/21.
 */
@RestController
@RequestMapping("mail")
public class MailController {
    @Reference
    private MailService sev;

    @RequestMapping(value = "/login")
    public User login(@RequestBody User user, HttpSession session){

        User u=sev.login(user);

        if(u!=null){
            session.setAttribute("user",u);
            return u;

        }{

            return u;
        }
    }



    @RequestMapping(value = "/list")
    public Lists list(HttpSession session){

    Lists ll=new Lists();
        List<Mailvo> list=sev.list();
        PageHelper.startPage(1,2);
        PageInfo<Mailvo> pp=new PageInfo<>(list);
         System.out.println(pp.getPages());
        User usere = (User) session.getAttribute("user");
        ll.setList(list);
        ll.setUser(usere);
        return ll;
    }

    @RequestMapping(value = "/dele")
    public String dele(@RequestParam(defaultValue = "")Integer id){
        sev.dele(id);
        return "删除成功";
    }

    @RequestMapping(value = "/tj",method = RequestMethod.POST)
    public String tj(@RequestBody Mail mail){
        sev.add(mail);


        return "添加成功";
    }

    @RequestMapping(value = "/df",method = RequestMethod.POST)
    public String df(@RequestBody Mail mail){
        sev.df(mail);


        return "答复成功";
    }
}
