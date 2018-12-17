package com.wbg.springAOP.springstatic;

import java.util.Random;

public class MathProxy implements IMath {
    IMath math = new MathImpl();

    @Override
    public int add(int n1, int n2) {
        //开始时间
        long start = getTime();
        delay();
        int result = math.add(n1, n2);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }

    @Override
    public int sub(int n1, int n2) {
        //开始时间
        long start = getTime();
        delay();
        int result = math.sub(n1, n2);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }

    @Override
    public int mut(int n1, int n2) {
        //开始时间
        long start = getTime();
        delay();
        int result = math.mut(n1, n2);
        System.out.println("共用时：" + (getTime() - start));
        return result;
    }

    @Override
    public int div(int n1, int n2) {
        //开始时间
        long start = getTime();
        delay();
        int result = math.div(n1, n2);
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
