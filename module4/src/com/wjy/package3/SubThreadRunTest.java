package com.wjy.package3;

public class SubThreadRunTest extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 20;i++) {
            System.out.println("run方法中的 i 的值： " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new SubThreadRunTest();
        t1.start();
        for(int i = 0;i < 20;i++) {
            System.out.println("main方法中的 i 的值： " + i);
        }
    }
}
