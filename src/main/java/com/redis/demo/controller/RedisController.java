package com.redis.demo.controller;

import com.redis.demo.bean.User;
import com.redis.demo.util.RedisUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/redisTest")
public class RedisController {
    @Resource
    private RedisUtils redisUtils;

    @GetMapping
    public User getRedisList() {
        User user1 = (User)redisUtils.get("user1");
        return user1;
    }

    @PutMapping
    public boolean update(@RequestHeader String key ,@RequestHeader String value){
        boolean flag = redisUtils.set(key, value);
        return flag;
    }

}
