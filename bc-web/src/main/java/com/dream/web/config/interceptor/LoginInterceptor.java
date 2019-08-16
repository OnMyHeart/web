package com.dream.web.config.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 一个拦截器，只有preHandle方法返回true，postHandle、afterCompletion才有可能被执行；如果preHandle方法返回false，则该拦截器的postHandle、afterCompletion必然不会被执行。拦截器不是Filter，却实现了Filter的功能，其原理在于：
 *
 * 所有的拦截器(Interceptor)和处理器(Handler)都注册在HandlerMapping中。
 * Spring MVC中所有的请求都是由DispatcherServlet分发的。
 * 当请求进入DispatcherServlet.doDispatch()时候，首先会得到处理该请求的Handler（即Controller中对应的方法）以及所有拦截该请求的拦截器。拦截器就是在这里被调用开始工作的。
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("登陆拦截器 preHandle()");
        request.getSession();
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("登陆拦截器 postHandle()");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("登陆拦截器 afterConcurrentHandlingStarted()");
        super.afterConcurrentHandlingStarted(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("登陆拦截器 afterCompletion()");
        super.afterCompletion(request, response, handler, ex);
    }
}
