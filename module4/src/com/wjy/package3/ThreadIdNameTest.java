package com.wjy.package3;

public class ThreadIdNameTest extends Thread{
    public ThreadIdNameTest(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("子线程的编号是：" + getId() + ",子线程的名字是：" + getName());
        setName("jgpcgs,cmmsgjhuo");
        System.out.println("修改以后的子线程的编号是：" + getId() + ",修改以后的子线程的名字是：" + getName());

    }

    public static void main(String[] args) {
        Thread t = new ThreadIdNameTest("hehehe");
        t.start();
        System.out.println("主线程的名字是：" + Thread.currentThread().getName() + ",主线程的编号是：" + Thread.currentThread().getId());
    }
}
