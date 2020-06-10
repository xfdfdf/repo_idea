package com.wjy.package3;

public class ThreadJoinTest extends Thread {
    @Override
    public void run() {
        System.out.println("子线程开始运行：");
        try {
            for(int i = 1;i < 11;i++) {
                System.out.println("主线程等待了 " + i + "秒");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t = new ThreadJoinTest();
        Thread t1 = new Thread(t);
        System.out.println("主线程开始等待");
        t1.start();
        try {
//            调用了join方法的线程一直执行，除非运行结束或者join(time)里面的等待时间结束
            t1.join(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程等待结束，终于等到你，还好没放弃");
    }
}
