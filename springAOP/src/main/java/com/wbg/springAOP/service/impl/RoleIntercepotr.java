package com.wbg.springAOP.service.impl;

import com.wbg.springAOP.game.Interceptor;

public class RoleIntercepotr implements Interceptor {
    @Override
    public void before(Object object) {
        System.out.println("准备打印信息");
    }

    @Override
    public void after(Object object) {
        System.out.println("已完成打印处理");
    }

    @Override
    public void afterReturning(Object object) {
        System.out.println("完成打印功能，正常");
    }

    @Override
    public void afterThrowing(Object object) {
        System.out.println("打印出现异常");
    }
}
