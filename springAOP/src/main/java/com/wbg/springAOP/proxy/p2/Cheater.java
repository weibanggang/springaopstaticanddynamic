package com.wbg.springAOP.proxy.p2;

public class Cheater implements Examable {
    private final Examable student;

    public Cheater(Examable student){
            this.student=student;
    }

    @Override
    public void exam() {
        System.out.println("代理考试Cheater");
        student.exam();
    }
}
