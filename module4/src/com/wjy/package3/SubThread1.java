package com.wjy.package3;

public class SubThread1 extends Thread {
    @Override
    public void run() {
        //打印1-100之间的所有奇数
        for(int i = 1;i < 101;i+=2) {
            System.out.println("***********1-100之间的奇数是 ： "  + i);
        }
    }

    public static void main(String[] args) {
        SubThread1 s = new SubThread1();
        s.start();
    }
}
