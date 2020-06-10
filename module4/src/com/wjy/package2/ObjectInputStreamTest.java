package com.wjy.package2;

import java.io.*;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream("D://a.txt"));
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
