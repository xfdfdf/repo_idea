package project20150806.server;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

//发送信息线程
public class SendThreat implements Runnable {
    Socket socket;
    //在这里使用PrintWriter流来向客户端发送信息，也可以用其它流
    PrintWriter pWriter;
    //接收来自主线程的客户端集合
    private ArrayList<Socket> socketList;

    //从键盘输入获取信息
    Scanner scanner = new Scanner(System.in);

    public SendThreat(Socket socket,ArrayList<Socket> socketList) {
        super();
        this.socket = socket;
        this.socketList=socketList;
        try {
//接收socket的字节输出流，用OutputStreamWriter把字节输出流转化为字符流，再传给PrintWriter
            pWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true) {
//获取从键盘输入的信息
            String strMsg =socket.getInetAddress().getHostAddress()+":"+ scanner.nextLine();
            if (strMsg == "b") {
                break;
            }

//把服务器收到的信息转发给各个客户端
            for (Socket clientSock : socketList) {
                PrintWriter pWriter;
                try {
//获取socket的输出流，用来向客户端发送信息
                    pWriter = new PrintWriter(clientSock.getOutputStream());
//输出信息给客户端
                    pWriter.println(strMsg);
//刷新输出流
                    pWriter.flush();
                } catch (IOException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }

// pWriter.close();
            }
//pWriter.println(strMsg);
//pWriter.flush();
//pWriter.close();
// System.out.println(strMsg);
        }

    }
}
