package project20150806.server;

import project20150806.server.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

//接收信息线程
public class ReceiveThreat implements Runnable {
    Socket socket;
    BufferedReader bReader;
    private ArrayList<Socket> socketList;

    public ReceiveThreat(Socket socket, ArrayList<Socket> socketList) {
        super();
        this.socket = socket;
        this.socketList = socketList;
        try {
//获取socket的输入流
            bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {

            try {
                String strMsg = bReader.readLine();
                System.out.println(strMsg);

                for (Socket clientSock : socketList) {
                    PrintWriter pWriter = new PrintWriter(clientSock.getOutputStream());
                    pWriter.println(strMsg);
                    pWriter.flush();
// pWriter.close();
                }

            } catch (IOException e) {
// TODO Auto-generated catch block
                ChatServer.socketList.remove(socket);
            }
        }
    }
}