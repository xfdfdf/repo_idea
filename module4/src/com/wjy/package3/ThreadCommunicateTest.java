package com.wjy.package3;

public class ThreadCommunicateTest extends Thread{
    private int cnt = 1;
    @Override
    public void run() {
        while(true) {
            synchronized(this) {

                if(cnt < 101) {
                    notify();
                    System.out.println("当前线程的名称是 ：" + Thread.currentThread().getName() + "cnt = " + cnt);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt++;
                    try {
                        wait();//当cnt = 101时，一个线程运行到这里进行等待，由其他的线程进行唤醒，但是由于有cnt < 101 条件不满足，
                               // 所以另外一个线程退出，而等待的线程被永远等待，无法唤醒是吧。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadCommunicateTest tct = new ThreadCommunicateTest();
        Thread t1 = new Thread(tct);
        Thread t2 = new Thread(tct);
        t1.start();
        t2.start();
    }
}
