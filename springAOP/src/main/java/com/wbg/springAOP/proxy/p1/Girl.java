package com.wbg.springAOP.proxy.p1;

import com.wbg.springAOP.proxy.p1.Sleepable;

public class Girl implements Sleepable {
    @Override
    public void sleep (){
        System.out.println("Girl的睡觉");
    }
}
