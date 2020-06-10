package com.wjy.package3;

public class ProduceThread extends Thread {

    private StoreHouse storeHouse;

    //确保两个线程共用一个仓库
    public ProduceThread(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while(true) {
            storeHouse.produceProduct();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
