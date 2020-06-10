package com.wjy.package2;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        //用ctrl+alt+t来生成异常的捕获代码
        //若文件不存在，该流会自动创建新的文件,
        // 若文件存在，会清空文件的内容，重新写入新的内容。不会保留原来的内容
//        可以以追加的方式创建文件     fw = new FileWriter("D://2020.5.21.拉钩.txt",true);
        FileWriter fw = null;
        try {
            fw = new FileWriter("D://2020.5.21.拉钩.txt");
            fw.write("helloworld");

            //写入字符数组
            char[] cArr = new char[]{'h','e','l','l','o'};
            fw.write(cArr,2,2);

//            刷新
            fw.flush();
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if(null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
