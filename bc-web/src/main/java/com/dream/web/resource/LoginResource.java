package com.dream.web.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginResource {

    private static Logger logger = LoggerFactory.getLogger(LoginResource.class);

    @GetMapping("/a")
    public String a(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(60);
        logger.info("开始执行方法");
        return "你说什么";
    }

}
