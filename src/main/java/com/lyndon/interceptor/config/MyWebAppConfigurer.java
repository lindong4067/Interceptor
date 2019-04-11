package com.lyndon.interceptor.config;

import com.lyndon.interceptor.interceptors.MyInterceptor1;
import com.lyndon.interceptor.interceptors.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: eznlzhi
 * @Email: lindong.zhao@ericsson.com
 * @Date: 12/27/2017
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    private MyInterceptor1 myInterceptor1;
    @Autowired
    private MyInterceptor2 myInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor1).addPathPatterns("/**");
        registry.addInterceptor(myInterceptor2).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
