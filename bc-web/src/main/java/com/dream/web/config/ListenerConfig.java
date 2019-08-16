package com.dream.web.config;

import com.dream.web.config.listener.EventListener;
import com.dream.web.config.listener.SessionListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.ServletContextListener -- 监听servletContext对象的创建以及销毁
 *
 *     1.1    contextInitialized(ServletContextEvent arg0)   -- 创建时执行
 *
 *     1.2    contextDestroyed(ServletContextEvent arg0)  -- 销毁时执行
 *
 * 2.HttpSessionListener  -- 监听session对象的创建以及销毁
 *
 *     2.2   sessionCreated(HttpSessionEvent se)   -- 创建时执行
 *
 *     2.2   sessionDestroyed(HttpSessionEvent se) -- 销毁时执行
 *
 * 3.ServletRequestListener -- 监听request对象的创建以及销毁
 *
 *     3.1    requestInitialized(ServletRequestEvent sre) -- 创建时执行
 *
 *     3.2    requestDestroyed(ServletRequestEvent sre) -- 销毁时执行
 *
 * 4.ServletContextAttributeListener  -- 监听servletContext对象中属性的改变
 *
 *     4.1    attributeAdded(ServletContextAttributeEvent event) -- 添加属性时执行
 *
 *     4.2    attributeReplaced(ServletContextAttributeEvent event) -- 修改属性时执行
 *
 *     4.3    attributeRemoved(ServletContextAttributeEvent event) -- 删除属性时执行
 *
 * 5.HttpSessionAttributeListener  --监听session对象中属性的改变
 *
 *     5.1    attributeAdded(HttpSessionBindingEvent event) -- 添加属性时执行
 *
 *     5.2    attributeReplaced(HttpSessionBindingEvent event) -- 修改属性时执行
 *
 *     5.3    attributeRemoved(HttpSessionBindingEvent event) -- 删除属性时执行
 *
 * 6.ServletRequestAttributeListener  --监听request对象中属性的改变
 *
 *     6.1    attributeAdded(ServletRequestAttributeEvent srae) -- 添加属性时执行
 *
 *     6.2    attributeReplaced(ServletRequestAttributeEvent srae) -- 修改属性时执行
 *
 *     6.3    attributeRemoved(ServletRequestAttributeEvent srae) -- 删除属性时执行
 * ---------------------
 * 版权声明：本文为CSDN博主「亦心_yan」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_38075425/article/details/81164501
 */
@Configuration
public class ListenerConfig {

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new EventListener());
        return servletListenerRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<SessionListener> sessionListenerServletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new SessionListener());
        return servletListenerRegistrationBean;
    }

}
