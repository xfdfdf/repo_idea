package com.wjy.package3;

public class ThreadPriorityTest extends Thread {
    @Override
    public void run() {
        this.setPriority(Thread.MAX_PRIORITY);
        System.out.println("子线程的优先级是：" + this.getPriority());
        for(int i = 0;i < 2000;i++) {
            System.out.println("子线程中的i : " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread t1 = new ThreadPriorityTest();
        t1.start();
        System.out.println("主线程的优先级是：" + t.getPriority());
        for(int i = 0;i < 2000;i++) {
            System.out.println("---主线程中的i : " + i);
        }
    }
}
