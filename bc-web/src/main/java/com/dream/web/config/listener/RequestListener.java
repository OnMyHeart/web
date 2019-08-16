package com.dream.web.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {

    private static Logger logger = LoggerFactory.getLogger(RequestListener.class);

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info("请求监听器 销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info("请求监听器 初始化");
    }
}
