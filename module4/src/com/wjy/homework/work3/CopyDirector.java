package com.wjy.homework.work3;

import com.wjy.package3.ThreadCallableTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyDirector {
    public static void main(String[] args) {
        //1.创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //2.向线程池中布置任务
        executorService.submit(new CopyDirectorThread());

        //3.关闭线程池
        executorService.shutdown();
    }


}
