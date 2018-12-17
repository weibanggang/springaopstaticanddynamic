package com.wbg.springAOP.proxy.p2;

public class Main {
    public static void main(String[] args) {
        Examable examable1 = new Student();
        examable1.exam();

        Examable examable2 = new Cheater(examable1);
        examable2.exam();
    }
}
