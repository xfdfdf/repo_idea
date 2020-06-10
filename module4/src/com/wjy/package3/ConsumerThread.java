package com.wjy.package3;

public class ConsumerThread extends Thread {

    private StoreHouse storeHouse;

    //确保两个线程共用一个仓库
    public ConsumerThread(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while(true) {
            storeHouse.consumerProduct();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
