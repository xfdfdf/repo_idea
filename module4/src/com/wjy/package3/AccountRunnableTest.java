package com.wjy.package3;

import java.util.concurrent.locks.ReentrantLock;

public class AccountRunnableTest implements Runnable {
    private int balance;
    private ReentrantLock lock = new ReentrantLock();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {

        lock.lock();
            int temp = getBalance();
            if(temp >= 200) {
                System.out.println("正在出钞，亲稍后");
                temp -= 200;
                try {
                    Thread.sleep(5000);
    //                temp -= 200;
    //                setBalance(temp);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                setBalance(temp);
                System.out.println("出钞成功，请取走你的钞票,当前的账户余额为：" + getBalance());
            } else {
                System.out.println("余额不足，请检查账户余额");
            }
            lock.unlock();
        }

    public static void main(String[] args) {
        AccountRunnableTest t1 = new AccountRunnableTest();
        t1.setBalance(1000);
        System.out.println(t1.getBalance());



        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t1);
        t3.start();
        t4.start();

    }
}
