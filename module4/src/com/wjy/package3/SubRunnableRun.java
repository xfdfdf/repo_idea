package com.wjy.package3;

public class SubRunnableRun implements Runnable {
    @Override
    public void run() {
        for(int i = 1;i < 21;i++) {
            System.out.println("run中的方法,i = " + i);
        }
    }
}
