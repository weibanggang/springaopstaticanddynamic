package com.wbg.springAOP.proxy.p3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkSingProxyGenerator implements InvocationHandler {
    private final Object agentobject;
    public JdkSingProxyGenerator(Object o){
        this.agentobject=o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入了代理invoke");
        return method.invoke(agentobject,args);
    }
}
