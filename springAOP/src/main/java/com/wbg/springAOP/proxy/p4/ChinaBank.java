package com.wbg.springAOP.proxy.p4;

public class ChinaBank {
    public float witdraw(float howmuch) {
        if (howmuch > 2000) {
            System.out.println("没有2000块钱");
        }else {
            System.out.println("正常");
        }
        return howmuch;
    }
}
