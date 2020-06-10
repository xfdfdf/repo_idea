package com.wjy.package2;

import java.io.*;
import java.util.Arrays;

public class FileCharCopyTest {
    @org.junit.Test
    public void Test1() {
        FileInputStream fr = null;
        FileOutputStream fw  =null;

        try {
            fr = new FileInputStream("F:\\BaiduNetdiskDownload\\算法训练营\\极客时间-算法训练营\\第02课丨训练准备和复杂度分析\\第02课丨02时间复杂度和空间复杂度分析.mp4");
            fw = new FileOutputStream("F://newAudio112.mp4");
            int i = -1;
            byte[] bArr = new byte[1024];
            while((i = fr.read(bArr)) != -1) {
                fw.write(bArr,0,i);
            }
//            fr.read(bArr);
//            fw.write(bArr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        //字符流只可以读写文本文件，其他的都不可以
        FileReader fr = null;
        FileWriter fw  =null;

        try {
            fr = new FileReader("D://a.txt");
            fw = new FileWriter("F://aaa.txt");
            char[] c = new char[2];
            int i = 0;
            while((i = fr.read(c)) != -1) {
                System.out.print(c[0] + "" + c[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
