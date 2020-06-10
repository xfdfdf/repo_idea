package com.wjy.package3;

public class SubThreadTest {
    public static void main(String[] args) {
        SubThread1 s1 = new SubThread1();
        SubThread2 s2 = new SubThread2();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
