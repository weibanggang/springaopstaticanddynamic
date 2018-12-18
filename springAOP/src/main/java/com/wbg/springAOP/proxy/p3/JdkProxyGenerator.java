package com.wbg.springAOP.proxy.p3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

public class JdkProxyGenerator implements InvocationHandler {

    private Object targetObject;

    public JdkProxyGenerator(Object o){
        this.targetObject = o;
    }
    public JdkProxyGenerator(){

    }
    public Object getProxyInstance(Object object){
        this.targetObject = object;
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = getTime();
        delay();

        System.out.println("方法名："+method.getName());
        Object o = method.invoke(targetObject,args);
        System.out.println("所用时间："+ (getTime()-start));
        return o;
    }

    public static Long getTime(){
        return System.currentTimeMillis();
    }
    public static void delay(){
        int read = new Random().nextInt(500);
        try {
            Thread.sleep(read);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
