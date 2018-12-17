package com.wbg.springAOP.proxy.p1;

public class GirlProxy implements Sleepable {
    private final Sleepable girl;

    public GirlProxy(Sleepable sleepable) {
        this.girl = sleepable;
    }

    @Override
    public void sleep() {
        System.out.println("GirlProxy的睡觉");
        girl.sleep();
    }
}
