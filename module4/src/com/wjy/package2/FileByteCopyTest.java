package com.wjy.package2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteCopyTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileInputStream fr = null;
        FileOutputStream fw  =null;

        try {
            fr = new FileInputStream("F:\\BaiduNetdiskDownload\\算法训练营\\极客时间-算法训练营\\第02课丨训练准备和复杂度分析\\第02课丨02时间复杂度和空间复杂度分析.mp4");
            fw = new FileOutputStream("F://newAudio11.mp4");
            int i = -1;

            byte[] bArr = new byte[fr.available()];
            fr.read(bArr);
            fw.write(bArr);

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
        long end = System.currentTimeMillis();

        System.out.println("普通字节流执行的时间是：" + (end - start) + "毫秒");
    }

}
