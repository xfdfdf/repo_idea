package com.wjy.homework.work5.server;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChatServer {

    //定义一个集合用来存放 监听到的客户端socket
    public static ArrayList<Socket> socketList = new ArrayList<>();
    private static File f = new File("F:\\聊天室文件夹");
    private static File[] files = f.listFiles();

    public static void main(String[] args) {
// TODO Auto-generated method stub
        ServerSocket serverSocket = null;

        try {
//新建一个服务端ServerSocket，锁定端口号为30000，端口号建议锁定大一点的
            serverSocket = new ServerSocket(30000);
            System.out.println("等待客户端连接...");
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (true) {
            Socket socket = null;
            while (true) {
                try {
//监听客户端的连接
                    socket = serverSocket.accept();
                    System.out.println("连接成功");
//加入集合
                    socketList.add(socket);
                    System.out.println("客户端 " + socket.getInetAddress().getHostAddress() + "连接成功！");

// showHello(socket);
//为该客户端分别开启一个发送信息线程和接收信息线程
                    new Thread(new SendThreat(socket,socketList)).start();
                    new Thread(new ReceiveThreat(socket, socketList)).start();

                } catch (IOException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
