package com.wbg.springAOP.game;

public class PorxyBeanFactory {

    public static <T> T getBean(T obj, Interceptor interceptor){
        return (T) ProxyBeanUtil.getBean(obj, interceptor);
    }
}
