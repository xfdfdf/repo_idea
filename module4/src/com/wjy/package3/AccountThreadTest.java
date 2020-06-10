package com.wjy.package3;

public class AccountThreadTest extends Thread {
    private static int balance;

    private static Demo demo = new Demo();
    public AccountThreadTest(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {

        AccountThreadTest.balance = balance;
    }

    @Override
    public void run() {
//        synchronized (demo) {
//            int temp = getBalance();
//            if (temp >= 200) {
//                System.out.println("正在出钞，亲稍后");
//                temp -= 200;
//                try {
//                    Thread.sleep(5000);
//                    //                temp -= 200;
//                    //                setBalance(temp);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                setBalance(temp);
//                System.out.println("出钞成功，请取走你的钞票,当前的账户余额为：" + getBalance());
//            } else {
//                System.out.println("余额不足，请检查账户余额");
//            }
//        }
        test();
    }
    public synchronized static void test() {

            int temp = balance;
            if (temp >= 200) {
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
                System.out.println("出钞成功，请取走你的钞票,当前的账户余额为：" + balance);
            } else {
                System.out.println("余额不足，请检查账户余额");
            }
    }
    public static void main(String[] args) {
       AccountThreadTest att1 = new AccountThreadTest(1000);
       att1.start();

       AccountThreadTest att2 = new AccountThreadTest(1000);
        try {
            AccountThreadTest att3 = (AccountThreadTest) att2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程开始等待：");
        try {
            att1.join();
            att2.start();
            att2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Demo{}