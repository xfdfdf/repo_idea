package com.wjy.homework.work4;

import com.wjy.homework.work4.com.entity.UserMessage;
import org.junit.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        Socket s = null;
        while(true) {


        try {
             serverSocket = new ServerSocket(18888);
             //定义Socket对象作为请求客户端与服务器的连接对象
            System.out.println("等待客户端连接：");
              s = serverSocket.accept();
            System.out.println("客户端连接成功：");

            ois = new ObjectInputStream(s.getInputStream());
            UserMessage userMessage = (UserMessage) ois.readObject();
            oos = new ObjectOutputStream(s.getOutputStream());
            if("admin".equals(userMessage.getUser().getUsername()) && "123456".equals(userMessage.getUser().getPassword())) {
                userMessage.setMessage("success");
            } else {
                userMessage.setMessage("fail");

            }
            oos.writeObject(userMessage);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != oos) {
                    oos.close();
                }
                if(null != ois) {
                    ois.close();
                }
                if(null != s) {
                    s.close();
                }
                if(null != serverSocket) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}

    }
    @Test
    public void test() {
        String s = "110";
        System.out.println(s);


    }
}
