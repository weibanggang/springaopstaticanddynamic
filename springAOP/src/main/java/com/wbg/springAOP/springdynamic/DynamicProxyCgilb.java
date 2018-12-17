package com.wbg.springAOP.springdynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/*
 * 动态代理类
 * 实现了一个方法拦截器接口
 */
public class DynamicProxyCgilb implements MethodInterceptor {

    //被代理对象
    Object targetObject;
    //动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例
    public Object getProxyObject(Object object){
        this.targetObject = object;
        //增强器，动态代码生成器
        Enhancer enhancer=new Enhancer();
        //回调方法
        enhancer.setCallback(this);
        //设置生成类的父类类型
        enhancer.setSuperclass(targetObject.getClass());
        //动态生成字节码并返回代理对象
        return enhancer.create();
    }
    // 拦截方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long start=getTime();
        delay();
        Object result=methodProxy.invoke(targetObject,objects);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }


    /**
     * 获取时间
     * @return
     */
    public static long getTime() {
        return System.currentTimeMillis();
    }

    /**
     * 延迟
     */
    public static void delay(){
        try {
            int n = (int) new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
