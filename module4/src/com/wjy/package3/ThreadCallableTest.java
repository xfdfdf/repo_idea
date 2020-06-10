package com.wjy.package3;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i <= 10000;i++) {
            sum += i;
        }
        System.out.println("计算的累加和是：" + sum);
        return sum;

    }

    public static void main(String[] args) {
        ThreadCallableTest tct = new ThreadCallableTest();
        FutureTask ft = new FutureTask(tct);
        Thread t1 = new Thread(ft);
        t1.start();
        Object obj = null;
        try {
            obj = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("线程处理方法的返回值是 ： " + obj);
    }

    @Test
    public void test() {
        String str = new String("helloworld");
        System.out.println(str.replace('l','0'));
        System.out.println(str);
    }
}
