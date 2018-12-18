package com.wbg.springAOP.aop.config;

import com.wbg.springAOP.aop.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//自动代理
@ComponentScan("com.wbg.springAOP.aop")
public class AopConfig {
    @Bean
    public RoleAspect getRoleAspct(){
        return new RoleAspect();
    }
}
