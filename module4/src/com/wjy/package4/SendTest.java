package com.wjy.package4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            //1.创建DatagramSocket对象
             ds = new DatagramSocket();
//        2.创建DatagramPacket对象并且提供接收方的通信地址和端口号
            byte[] bArr = "hello".getBytes();
            DatagramPacket dp = new DatagramPacket(bArr,bArr.length, InetAddress.getLocalHost(),8888);
//        3.通过socket发送packet，调用send方法、
            ds.send(dp);

//            接收回发的数据内容
            byte[] bArr2 = new byte[20];
            DatagramPacket dp2 = new DatagramPacket(bArr2,bArr2.length);
            ds.receive(dp2);
            System.out.println("接收到的回发消息是：" + new String(bArr2,0,dp2.getLength()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != ds) {
                ds.close();
            }
        }
        //4.关闭socket，并且释放相关资源

    }
}
