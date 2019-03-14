package com.adapter;

import com.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MyAdapter
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@SpringBootConfiguration
public class MyAdapter extends WebMvcConfigurerAdapter{
   /* @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }*/

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
