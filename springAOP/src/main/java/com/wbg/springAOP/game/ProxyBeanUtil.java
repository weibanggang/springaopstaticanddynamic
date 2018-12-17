package com.wbg.springAOP.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {
    //被代理对象
    private Object object;
    //拦截器
    private Interceptor interceptor = null;

    /**
     * 获取动态代理对象
     * @param object 被代理对象
     * @param interceptor 拦截器
     * @return
     */
    public static Object getBean(Object object, Interceptor interceptor){
        ProxyBeanUtil _this = new ProxyBeanUtil();
        //保存被代理对象
        _this.object = object;
        //保存拦截器
        _this.interceptor = interceptor;
        //生成代理对象，并绑定代理方法
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),_this);
    }

    /**
     * 代理方法
     * @param proxy 代理对象
     * @param method 当前调度方法
     * @param args 参数
     * @return 方法返回
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj = null;
        //是否产生异常
        boolean exceptionFlag = false;
        //before方法
        interceptor.before(object);
        try {
            //反射原有方法
            retObj = method.invoke(object,args);
        }catch (Exception e){
            exceptionFlag = true;
        }finally {
            //after方法完成打印处理
            interceptor.after(object);
        }
        if(exceptionFlag){
            //异常afterThrowing
            interceptor.afterThrowing(object);
        }else{
            //正常运行afterReturning
            interceptor.afterReturning(object);
        }
        return object;
    }
}
