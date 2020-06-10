package com.wjy.package2;

import org.junit.Test;

import java.io.*;

public class BufferedCharCopyTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        System.out.println("正在玩命的拷贝");
        try {
            br = new BufferedReader(new FileReader("D://a.txt"));
            bw = new BufferedWriter(new FileWriter("D://copyaa.txt"));
            String str = null;
            while((str = br.readLine()) != null) {
                bw.write(str);

            }
            bw.newLine();
            System.out.println("拷贝成功");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test() {
        System.out.println("asdasdasd" + (char)'\r'  + "sd"   + "asdasdasd" + "adfasdasdasdas");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D://copyaa.txt"));
            int i = -1;
            while((i = br.read()) != -1) {
                System.out.println("读取到的单个字符是：" + (char)i + ",对应的编号是：" + i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
