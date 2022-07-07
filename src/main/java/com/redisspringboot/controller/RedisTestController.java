package com.redisspringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/redisTest")
    public String redisTest() {
        redisTemplate.opsForValue().set("name","luozim");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }
}
