package com.wbg.springAOP.spring.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop01.xml");
        Math math = new Math();
        int n=100;
        int m=5;
        math.add(n,m);
        math.sub(n,m);
        math.mut(n,m);
        math.div(n,m);


    }
}
