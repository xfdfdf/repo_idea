package com.wjy.package1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        1.构造File类型的对象与d:a.txt我加你关联
        File f1 = new File("d:/a.txt");
        //2.若文件已经存在则获取文件的相关特征信息，打印以后删除文件
        if (f1.exists()) {
            System.out.println("文件的名称是：" + f1.getName());
            System.out.println("文件的大小是：" + f1.length());
            System.out.println("文件的最后一次修改时间是：" + f1.lastModified());
            long d1 = f1.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = new Date(d1);
            String str = sdf.format(d);
            System.out.println("str = " + str);
            System.out.println("文件的绝对路径是：" + f1.getAbsolutePath());
            System.out.println(f1.delete() ? "删除成功" : "删除失败");
        } else {
            //3.若文件不存在就创建新的文件
            System.out.println(f1.createNewFile() ? "文件创建成功" : "文件创建失败！");
        }
        System.out.println("*****************************************");
//        4.实现目录的创建和删除
        File f2 = new File("d://javatest/你猜我猜不猜/死鬼");
        if (f2.exists()) {
            System.out.println("目录的名称是：" + f2.getName());
            System.out.println(f2.delete() ? "目录删除成功" : "目录删除失败");
        } else {
            System.out.println(f2.mkdirs() ? "目录创建成功" : "目录创建失败");
        }
//        5.实现将指定目录中所有内容打印出来
        File f3 = new File("D:\\王总信息");
        File f4 = new File("D:\\王总信息\\答辩的三个问题.txt");
        System.out.println("f4文件的大小是：" + f4.length());
        File[] listFiles = f3.listFiles();
        for (File f : listFiles) {
            if (f.isFile()) {
                System.out.println("文件 ：" + f.getName());
            } else if (f.isDirectory()) {
                System.out.println("[目录是 ：" + f.getName() + "]");

            }
        }
        System.out.println(listFiles.length);

        //6.实现文件里面内容的获取，同时进行过滤
//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".pdf");
//            }
//        };

        //lambda表达式
        FileFilter filter = (File pathName) -> {

            return pathName.getName().endsWith(".pdf");

        };

        listFiles = f3.listFiles(filter);
        for (File f : listFiles) {
            if (f.isFile()) {
                System.out.println("文件 ：" + f.getName());
            } else if (f.isDirectory()) {
                System.out.println("[目录是 ：" + f.getName() + "]");

            }
        }
        System.out.println(listFiles.length);


        System.out.println("------------------------------");
        show(f3);
        System.out.println("------------------------------");

    }


    //实现将目录下的文件和子目录的内容全部打印出来的方法
    public static void show(File fileName) {
        File[] listFiles = fileName.listFiles();
        for (File f : listFiles) {
            if (f.isFile()) {
                System.out.println("文件名字是：" + f.getName());
            } else if(f.isDirectory()){

                System.out.println(" 目录开始，目录的名字是：[ " + f.getName() + " ] ");
                show(f);
                System.out.println("目录结束");
            }
        }
    }

}



