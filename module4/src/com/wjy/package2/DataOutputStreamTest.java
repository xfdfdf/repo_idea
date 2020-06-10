package com.wjy.package2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("D://aaaa.txt"));
//            dos.writeUTF("3412312");
            dos.write(662121);
            dos.writeInt(66);
            dos.writeInt(66);
            System.out.println((char)66);
            System.out.println((char)'\n');
            System.out.println('\n');
            System.out.println("写入数据成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != dos) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
