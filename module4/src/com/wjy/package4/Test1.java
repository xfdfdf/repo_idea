package com.wjy.package4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) {
        String str = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                if ("bye".equals((str = br.readLine()) )) {
                    System.out.println("拜拜");
                    break;
                }else {
                    System.out.println(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
