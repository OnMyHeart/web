package com.dream.web.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class EventListener implements ServletContextListener {

    private static Logger logger = LoggerFactory.getLogger(EventListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("监听器 初始化 contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("监听器 销毁 contextDestroyed()");
    }
}
