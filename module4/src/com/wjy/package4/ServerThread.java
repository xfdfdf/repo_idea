package com.wjy.package4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread {
    private Socket s;


    public  ServerThread(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;
        try {

        Scanner input =new Scanner(System.in);
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ps = new PrintStream(s.getOutputStream());
        while(true) {
            String str = br.readLine();
            if("bye".equals(str) ) {
                System.out.println("拜拜");
                ps.println(str);

                break;
            }
            ps.println(str);


        }
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                ps.close();
            }
            if(null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
