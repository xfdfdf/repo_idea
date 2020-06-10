package com.wjy.package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCatchTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            System.out.println("1");
            fis = new FileInputStream("D:/模2块4.doc");
            System.out.println("2");
        } catch (FileNotFoundException e) {
            System.out.println("3");
            e.printStackTrace();
            System.out.println("4");
        }

        //关闭文件
        try {
            System.out.println("5");
            fis.close();
            System.out.println("6");
        } catch(IOException e){

        } catch (Exception e) {
            System.out.println("7");
            e.printStackTrace();
            System.out.println("8");

        }

        System.out.println("世界上最真情的相依就是你在try我在catch,无论你发神马脾气我都默默承受并且静静的处理，到那时再来期待我们的finally");
    }
}
