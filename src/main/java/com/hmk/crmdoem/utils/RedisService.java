package com.hmk.crmdoem.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    public void put(String key,Object value,long millis){
        redisTemplate.opsForValue().set(key,value,millis, TimeUnit.MINUTES);
    }

    public String getString(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }
    public void delete(String key){
        redisTemplate.delete(key);
    }
}
