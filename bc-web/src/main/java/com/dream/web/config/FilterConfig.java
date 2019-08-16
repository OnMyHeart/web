package com.dream.web.config;

import com.dream.web.config.filter.FirstFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * spring的拦截器和servlet的过滤器有相似之处，都是AOP思想的体现，都可以实现权限检查，日志记录，不同的是
 *
 * 适用范围不同：Filter是Servlet容器规定的，只能使用在servlet容器中，而拦截器的使用范围就大得多
 * 使用的资源不同：拦截器是属于spring的一个组件，因此可以使用spring的所有资源，对象，如service对象，数据源，事务控制等，而过滤器就不行
 * 深度不同：Filter还在servlet前后起作用。而拦截器能够深入到方法前后，异常抛出前后，因此拦截器具有更大的弹性，所有在spring框架中应该优先使用拦截器。
 * 通过调试可以发现，拦截器的执行过程是在过滤器的doFilter中执行的，过滤器的初始化会在项目启动时执行。
 */
@Configuration
public class FilterConfig {

    @Bean
    @Order(1) //spring boot会按照order值的大小，从小到大的顺序来依次过滤
    public FilterRegistrationBean<FirstFilter> firstFilter(){
        FilterRegistrationBean<FirstFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new FirstFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
