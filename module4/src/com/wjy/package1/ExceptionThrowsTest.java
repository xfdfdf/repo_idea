package com.wjy.package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrowsTest {

    public static void show() throws IOException {
        FileInputStream fis = new FileInputStream("D://模块4.pdf");
        System.out.println("我看看看你抛出异常后是否继续向下执行？？？");
        fis.close();
    }
    public static void test1() throws IOException {
        show();
    }

    public static void test2() throws IOException {
        test1();
    }public static void test3() throws IOException {
        test2();
    }
    public static void main(String[] args) {

        try {
            test3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
