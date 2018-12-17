package com.wbg.springAOP.proxy.p2;

public class Student implements Examable {

    @Override
    public void exam() {
        System.out.println("学生考试");
    }
}
