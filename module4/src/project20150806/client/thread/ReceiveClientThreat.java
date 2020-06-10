package project20150806.client.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//接收信息线程
public class ReceiveClientThreat implements Runnable {
    Socket socket;
    BufferedReader bReader;

    public ReceiveClientThreat(Socket socket) {
        super();
        this.socket = socket;
        try {
            bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {

            while (true) {
                String strMsg = bReader.readLine();

                System.out.println("               ********接收到的数据是：" + strMsg);
            }

        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}