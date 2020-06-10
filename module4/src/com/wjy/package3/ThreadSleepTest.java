package com.wjy.package3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleepTest implements Runnable{
    public static void main(String[] args) {
        ThreadSleepTest tst = new ThreadSleepTest();
        Thread t = new Thread(tst);
        t.start();

    }

    @Override
    public void run() {
        Date d = new Date();
        long times  = d.getTime() + 5000;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while(times > d.getTime()) {
        try {
            Thread.sleep(1000);
            System.out.println("当前时间是 ：" + sdf.format(d));
            d = new Date();
            }catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
