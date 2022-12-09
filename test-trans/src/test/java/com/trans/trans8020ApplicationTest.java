package com.trans;

import com.trans.entity.Sender;
import com.trans.utils.EmailUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class trans8020ApplicationTest {

    @Autowired
    EmailUtil emailUtil;
    @Test
    public void test1(){
        String[] to=new String[1];
        to[0]="1565115013@qq.com";
        Sender sender = new Sender(to, "循环发送", "5秒发送一次");
        try {
            emailUtil.sendSetTimeCycle(sender,5L, TimeUnit.SECONDS,5L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        String[] to=new String[1];
        to[0]="1565115013@qq.com";
        File file = new File("D:\\logs\\logback.log");
        File[]files=new File[1];
        files[0]=file;
        Sender sender = new Sender(to, "定时任务,添加附件", "5秒后发送");
        try {
            emailUtil.sendSetTime(sender,files,20L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test3(){
        Double[][] data=new Double[14][14];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 14; i++) {
            String s=in.nextLine();
            String[] s1 = s.split(" ");
            for (int j = 0; j < 14; j++) {
                data[i][j]=  Double.parseDouble(s1[j]);
            }
        }
       StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                sb.append("["+i+","+j+data[i][j]+"],\n");
            }
        }
        System.out.println(sb);
    }
    @Test
    public void test4(){
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
       while (hashSet.size()<20){
           hashSet.add(random.nextInt(45)+1);
       }
        hashSet.forEach(o-> System.out.print(o+" "));
    }
}
