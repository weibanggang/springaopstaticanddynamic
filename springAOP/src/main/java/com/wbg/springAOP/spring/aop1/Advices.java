package com.wbg.springAOP.spring.aop1;

import org.aspectj.lang.JoinPoint;

public class Advices {
    public void before(JoinPoint jp){
        System.out.println("----------前置通知----------");
        System.out.println(jp.getSignature().getName());
    }

    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }
}
