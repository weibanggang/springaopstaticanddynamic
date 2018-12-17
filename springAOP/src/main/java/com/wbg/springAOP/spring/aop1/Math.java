package com.wbg.springAOP.spring.aop1;

import org.springframework.stereotype.Service;

import java.util.Random;


public class Math {
    //加
    public int add(int n1,int n2){
        //开始时间
        long start = getTime();
        delay();
        int result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }
    //减
    public int sub(int n1,int n2){
        //开始时间
        long start = getTime();
        delay();
        int result=n1*n2;
        System.out.println(n1+"-"+n2+"="+result);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }

    //乘
    public int mut(int n1,int n2){
        //开始时间
        long start = getTime();
        delay();
        int result=n1*n2;
        System.out.println(n1+"X"+n2+"="+result);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }

    //除
    public int div(int n1,int n2){
        //开始时间
        long start = getTime();
        delay();
        int result=n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }
    public static long getTime() {
        return System.currentTimeMillis();
    }
    public static void delay(){
        try {
            int n = (int) new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
