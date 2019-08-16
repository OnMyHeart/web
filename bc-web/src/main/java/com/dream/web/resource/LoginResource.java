package com.dream.web.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginResource {

    private static Logger logger = LoggerFactory.getLogger(LoginResource.class);

    @Resource
    RedisTemplate redisTemplate;

    @GetMapping("/a")
    public String a(){
        logger.info("开始执行方法");
        RedisConnectionFactory redisConnectionFactory = redisTemplate.getConnectionFactory();
        logger.info("redis 连接池 {}",redisConnectionFactory);
        return "你说什么";
    }

}
