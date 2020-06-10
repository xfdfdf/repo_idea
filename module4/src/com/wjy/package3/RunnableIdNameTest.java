package com.wjy.package3;

import java.net.URL;

public class RunnableIdNameTest implements Runnable{


    @Override
    public void run() {
        Thread t1 = Thread.currentThread();
        System.out.println("子线程的编号是：" + t1.getId() + ",子线程的名称是：" + t1.getName());
        t1.setName("zhangfei");
        System.out.println("修改以后的子线程的编号是：" + t1.getId() + ",修改以后子线程的名称是：" + t1.getName());


    }

    public static void main(String[] args) {
        Runnable r = new RunnableIdNameTest();
        Thread t2 = new Thread(r,"guangyu");
        t2.start();
        Thread t1 = Thread.currentThread();
        System.out.println("主线程的编号是：" + t1.getId() + ",主线程的名称是：" + t1.getName());

    }
}
