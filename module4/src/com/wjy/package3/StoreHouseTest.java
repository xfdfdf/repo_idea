package com.wjy.package3;

public class StoreHouseTest {
    public static void main(String[] args) {
        StoreHouse storeHouse = new StoreHouse();
        ProduceThread p = new ProduceThread(storeHouse);
        ConsumerThread s = new ConsumerThread(storeHouse);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}
