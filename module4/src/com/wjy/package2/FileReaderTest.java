package com.wjy.package2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D://2020.5.21.拉钩.txt");
//            int i;
//            while(( i = fr.read()) != -1) {
//                System.out.print((char)i);
//            }

            char[] cArr = new char[5];
            fr.read(cArr,2,3);
            for(char c : cArr) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
