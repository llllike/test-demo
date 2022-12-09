package com.trans.controller;


import com.trans.entity.Sender;
import com.trans.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.concurrent.TimeUnit;

@RestController
public class testController {

    @Autowired
    EmailUtil emailUtil;
    @GetMapping("/test1")
    public Sender test1(){
        String[] to=new String[1];
        to[0]="3515701089@qq.com";
        Sender sender = new Sender(to, "循环发送", "5秒发送一次");
        try {
            emailUtil.sendSetTimeCycle(sender,5L, TimeUnit.SECONDS,5L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sender;
    }

    @GetMapping("/test2")
    public Sender test2(){
        String[] to=new String[1];
        to[0]="1565115013@qq.com";
        File file = new File("D:\\logs\\logback.log");
        File[]files=new File[1];
        files[0]=file;
        Sender sender = new Sender(to, "定时任务,添加附件", "5秒后发送");
        try {
            emailUtil.sendSetTime(sender,files,5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sender;
    }

}
