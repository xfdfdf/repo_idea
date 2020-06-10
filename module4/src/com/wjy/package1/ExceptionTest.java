package com.wjy.package1;

public class ExceptionTest {
    public static void main(String[] args) {
        //1.见识一下非检测异常，也就是运行异常
        System.out.println(5 / 0);    //编译没有问题，运行阶段会发生异常，下面的的代码不会执行

//        2.检测异常
        try {
            Thread.sleep(5000);   //编译错误，不处理就无法到运行阶段
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序正常结束了");
    }
}
