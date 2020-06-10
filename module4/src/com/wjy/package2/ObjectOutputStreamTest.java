package com.wjy.package2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        User user = new User("admin","admin",12);
        ObjectOutputStream oos = null;
        try {
             oos = new ObjectOutputStream(new FileOutputStream("D://a.txt"));
             oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != oos) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
