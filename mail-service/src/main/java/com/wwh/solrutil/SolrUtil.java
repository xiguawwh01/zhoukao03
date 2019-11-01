package com.wwh.solrutil;

import com.pinyougou.mapper.MailMapper;
import com.wwh.pojo.Mailvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/19.
 */
@Component
public class SolrUtil {
    @Autowired
    private MailMapper mapper;

//    /**
//     * 导入商品数据
//     */
//    public void importItemData(){
//        TbItemExample example=new TbItemExample();
//        Criteria criteria = example.createCriteria();
//        criteria.andStatusEqualTo("1");//已审核
//        List<TbItem> itemList = itemMapper.selectByExample(example);
//        List<Mailvo> list = mapper.list();
//
//        System.out.println("===商品列表===");
//        for(TbItem item:itemList){
//            System.out.println(item.getTitle());
//        }
//        System.out.println("===结束===");
//    }
//
//    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");
//        SolrUtil solrUtil=  (SolrUtil) context.getBean("solrUtil");
//        solrUtil.importItemData();
//    }
}

