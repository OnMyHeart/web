package com.dream.web.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginResource {

    private static Logger logger = LoggerFactory.getLogger(LoginResource.class);

    @GetMapping("/a")
    public String a(){
        logger.info("开始执行方法");
        logger.info("结束执行方法");
        return "你说什么";
    }

}
