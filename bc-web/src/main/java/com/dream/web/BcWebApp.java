package com.dream.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//自动扫描指定包下（默认是与启动类同包下）的WebFilter/WebServlet/WebListener等特殊类
@ServletComponentScan(basePackages = {"com.dream.*"})
public class BcWebApp {
    public static void main(String[] args) {
        SpringApplication.run(BcWebApp.class, args);
    }
}
