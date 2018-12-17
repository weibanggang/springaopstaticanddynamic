package com.wbg.springAOP.springstatic;

public class Test {
    public static void main(String[] args) {
        IMath math = new MathProxy();
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
