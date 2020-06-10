package com.wjy.package2;

import java.io.*;

public class BufferedByteCopyTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {

            bis = new BufferedInputStream( new FileInputStream("F:\\BaiduNetdiskDownload\\算法训练营\\极客时间-算法训练营\\第02课丨训练准备和复杂度分析\\第02课丨02时间复杂度和空间复杂度分析.mp4"));
             bos = new BufferedOutputStream(new FileOutputStream("F://newAudio11.mp4"));
            System.out.println("正在玩命的拷贝！");
             byte[] bArr = new byte[1024];
           byte[] b1 = {'h','e','l','o'};
             int i = bis.read(b1);
            System.out.println(i);
            System.out.println((byte)4);
            System.out.println("拷贝完成！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("缓冲流执行的时间是：" + (end - start) + "毫秒");

    }
}
