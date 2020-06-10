package com.wjy.package2;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrintStreamChatTest {
    public static void main(String[] args) {
        PrintStream ps = null;
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String user1 = "张三";
        String user2 = "李四";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean isFlag = true;    //true:张三说，false：李四说
        try {
            ps = new PrintStream(new FileOutputStream("D://a.txt",true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
        while(true) {


            System.out.print((isFlag == true ? user1 : user2) + " ：你好，请输入要发送的信息：");

                str = br.readLine();

            if ("bye".equals(str)) {
                System.out.println("byebye");
                ps.println(sdf.format(new Date()) + "  一次聊天结束。");
                ps.println();
                ps.println();
                ps.close();
                break;
            } else {
                ps.println(sdf.format(new Date()) +   "   " + (isFlag?user1:user2) + "说：" + str );
                isFlag = !isFlag;

            }} }catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


@Test
    public void test() {
        File file1 = new File("");
        File file2 = new File("");
}



    }

