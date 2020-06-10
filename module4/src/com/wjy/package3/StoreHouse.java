package com.wjy.package3;

public class StoreHouse {
    private int cnt = 0;
    public synchronized void produceProduct() {
        notify();
        if(cnt < 10) {
            System.out.println("当前线程 " + Thread.currentThread().getName() + "生产了 " + (cnt + 1) + "个包");
            cnt++;

        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        notify();
        if(cnt > 0) {
            System.out.println("当前线程 " + Thread.currentThread().getName() + "消费了 " + cnt + "个包");

            cnt--;

        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
