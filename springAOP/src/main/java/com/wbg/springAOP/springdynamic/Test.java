package com.wbg.springAOP.springdynamic;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
       MathImpl math = (MathImpl) new DynamicProxyCgilb().getProxyObject(new MathImpl());
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

    public static void dynamicProxy(){
        DynamicProxy dynamicProx = new DynamicProxy(new MathImpl());
        IMath math = (IMath) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{IMath.class},dynamicProx);
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
