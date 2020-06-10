package com.wjy.package3;

public class SubRunnableTest {
    public static void main(String[] args) {
        SubRunnableRun srr = new SubRunnableRun();
        Thread t1 = new Thread(srr);
        t1.start();

            for(int i = 1;i < 21;i++) {
                System.out.println("main中的方法,i = " + i);
            }

    }
}
