package com.wjy.package4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientStringTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Socket s = null;
        PrintStream ps = null;
        BufferedReader br = null;
        try {
            s = new Socket("localhost",8888);
            System.out.println("连接服务器成功");

            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while(true) {
                System.out.println("请输入你要发送的数据：");
                String str = input.next();
                ps.println(str);

                System.out.println("服务器回发的数据是：" + br.readLine());
                if("bye".equals(str)) {
                    System.out.println("客户端结束会话");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != ps) {
                ps.close();
            }
        }
    }
}
