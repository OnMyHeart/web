package com.dream.web.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "secondFilter")
public class SecondFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(FirstFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("第二层过滤器 执行任务 开始 doFilter()");
        chain.doFilter(request,response);
        logger.info("第二层过滤器 执行任务 完成 doFilter()");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("第二层过滤器 初始化 init()");
    }

    @Override
    public void destroy() {
        logger.info("第一层过滤器 销毁 destroy()");
    }
}
