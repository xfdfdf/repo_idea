package com.wjy.homework.work4;

import com.wjy.homework.work4.com.entity.User;
import com.wjy.homework.work4.com.entity.UserMessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        Socket s = null;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入用户名: ");
            String username = input.nextLine();
            System.out.print("请输入密码: ");
            String password = input.nextLine();
            User user = new User(username,password);
            UserMessage userMessage = new UserMessage("",user);
            s = new Socket("localhost",18888);
            oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(userMessage);
            ois = new ObjectInputStream(s.getInputStream());
            UserMessage userMessage1 = (UserMessage) ois.readObject();
            if("success".equals(userMessage1.getMessage())) {
                System.out.println("登录成功！！！");
            }else {
                System.out.println("登录失败");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
