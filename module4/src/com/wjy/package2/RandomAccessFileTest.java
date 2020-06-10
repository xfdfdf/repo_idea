package com.wjy.package2;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.io.*;
import java.util.RandomAccess;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("D://a.txt","rw");
            int i = raf.read();   //hwlloworldjkhe;llpwpr;lfd
                                  //hwloworldjkhe;llpwpr;lfd
            System.out.println((char)i);
            raf.seek(1);
            i = raf.read();
            System.out.println((char)i);
            i = raf.read();
            System.out.println((char)i);
            raf.write('2');
            System.out.println((char)2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("a"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
