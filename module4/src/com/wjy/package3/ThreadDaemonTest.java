package com.wjy.package3;

public class ThreadDaemonTest extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 2000;i++) {
            System.out.println("子线程中i的值是：" + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadDaemonTest());
        t.setDaemon(true);
        t.start();
        for(int i = 0;i < 20;i++) {
            System.out.println("----主线程中i的值是：" + i);
        }
    }
}
