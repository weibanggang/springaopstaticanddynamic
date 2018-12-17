package com.wbg.springAOP.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices2 {
    @Before("execution(* com.wbg.springAOP.spring.annotation.Math2*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("----------前置通知----------");
        System.out.println(joinPoint.getSignature().getName());
    }
    @After("execution(* com.wbg.springAOP.spring.annotation.Math2(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("----------最终通知----------");
    }
}
