package com.redis;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author yzy
 * @create 2022-08-25-12:02
 */
@SpringBootTest
public class redis8021ApplicationTest {
    @Autowired
    StringRedisTemplate redisTemplate;
    @Test
    public void test1(){
        redisTemplate.opsForValue()
                .set("test1", JSON.toJSONString(new user("张三","123")));
    }
    @Data
    @AllArgsConstructor
    private class user{
        private String name;
        private String password;
    }
}
