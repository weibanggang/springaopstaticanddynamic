package com.wbg.springAOP.proxy.p3;

import com.wbg.springAOP.proxy.p1.Girl;
import com.wbg.springAOP.proxy.p1.GirlProxy;
import com.wbg.springAOP.proxy.p1.Sleepable;
import com.wbg.springAOP.proxy.p2.Examable;
import com.wbg.springAOP.proxy.p2.Student;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Examable examable = (Examable) Proxy.newProxyInstance(
                classLoader, new Class[]{Examable.class},
                new JdkSingProxyGenerator(new Student())
        );

        examable.exam();

        Sleepable ex2 = (Sleepable) Proxy.newProxyInstance(
                classLoader, new Class[]{Sleepable.class},
                new JdkSingProxyGenerator(new Girl())
        );

        ex2.sleep();

    }
}
