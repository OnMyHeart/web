package com.dream.web.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/base")
public class BaseResource {

    private static Logger logger = LoggerFactory.getLogger(BaseResource.class);

    @GetMapping("/a")
    public String a(HttpServletRequest request, HttpServletResponse response){
        logger.info("开始执行 b");
        return "index";
    }
}
