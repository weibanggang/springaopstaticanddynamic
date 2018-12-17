package com.wbg.springAOP.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        Math2 math = context.getBean("math2",Math2.class);
        int n=100;
        int m=5;
        math.add(n,m);
        math.sub(n,m);
        math.mut(n,m);
        math.div(n,m);


    }
}
