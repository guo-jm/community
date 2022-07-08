package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author GuoJiaming
 * @version 1.0
 */

@Service
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    //在构造方法之后 调用此方法
    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    //在销毁之前 调用此方法 因此可以在这里释放资源等操作
    @PreDestroy
    public void destory(){
        System.out.println("销毁AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }


}
