package com.wjy.homework.work5.client;

import com.wjy.homework.work5.client.thread.ReceiveClientThreat;
import com.wjy.homework.work5.client.thread.SendClientThreat;

import java.io.IOException;
import java.net.Socket;


public class ChatClient {

    private static Socket socket;

    public static void main(String[] args) {
//服务端的IP
        String IPAdress="localhost";
//创建一个客户端socket，指定服务端的IP和端口号
        try {
            socket = new Socket(IPAdress, 30000);
            System.out.println("连接主机成功！ ");

            new Thread(new ReceiveClientThreat( socket)).start();
            new Thread(new SendClientThreat("佩琪1号",socket)).start();

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
