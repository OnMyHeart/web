package com.dream.web.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*",filterName = "firstFilter")
public class FirstFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(FirstFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("FirstFilter doFilter()");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("FirstFilter init()");
    }

    @Override
    public void destroy() {
        logger.info("FirstFilter destroy()");
    }
}
