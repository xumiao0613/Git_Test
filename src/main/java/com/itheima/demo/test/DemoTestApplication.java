package com.itheima.demo.test;

import com.itheima.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Miao
 * @Date: 2019/7/20 22:44
 * @Desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoTestApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DemoTestApplication.class);

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() {
        String key = "name";
        String value = "XuMiao";
//        insetData(key, value);
        queryData(key);
    }

    private void insetData(String key, String value) {
        redisTemplate.boundValueOps(key).set(value);
        LOG.info("insert Data Success...");
    }

    private void queryData(String key) {
        String name = redisTemplate.opsForValue().get(key);
        LOG.info("name : " + name);
    }
}
