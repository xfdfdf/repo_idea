package com.wjy.package3;

public class SubRunnable2 implements Runnable {
    @Override
    public void run() {
        //打印1-100之间的所有偶数
        for(int i = 2;i < 101;i+=2) {
            System.out.println("1-100之间的偶数是 ： "  + i);
        }
    }

    public static void main(String[] args) {
        SubRunnable1 s = new SubRunnable1();

    }
}
