package com.wjy.package3;

public class ThreadNoNameTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run() {
                for(int i = 1;i < 21;i++) {
                    System.out.println("run中的方法,i = " + i);
                }
            }
        };
        t1.start();
        new Thread(new Runnable() {
            public void run() {
                for(int i = 1;i < 21;i++) {
                    System.out.println("run中的方法,6563 = " + i);
                }
            }
        }).start();

        Runnable ra = ()-> {
            for(int i = 1;i < 21;i++) {
                System.out.println("run中的方法,6512-63 = " + i);
            }
        };
        new Thread(ra).start();
    }
}
