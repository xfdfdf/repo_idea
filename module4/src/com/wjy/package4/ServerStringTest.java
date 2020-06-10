package com.wjy.package4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ServerStringTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;


        try {

            ss = new ServerSocket(8888);
            while(true) {
            System.out.println("等待客户端的连接请求");
            s = ss.accept();
            System.out.println("客户端连接成功");
            new  ServerThread(s).start();

        }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
