package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AS");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AS");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁AS");
    }

    public String find() {
        return alphaDao.select();
    }


}
