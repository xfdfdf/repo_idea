package com.wjy.package2;

import java.io.*;

public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;


        try {
            dis = new DataInputStream(new FileInputStream("D://aaaa.txt"));
            int i = dis.read();
            System.out.println(i);
             i = dis.readInt();
            System.out.println(i);
            i = dis.readInt();
            System.out.println(i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
