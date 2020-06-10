package com.wjy.package4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReceiveTest {
    public static void main(String[] args) {
        //1. 创建DatagramSocket对象并且提供端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            //2. 创建DatagramPacket类型的对象并且提供缓冲区
            byte[] bArr = new byte[20];
            DatagramPacket dp = new DatagramPacket(bArr,bArr.length);

            //3. 通过Socket接收数据内容存放到Packer里面，调用receive方法
            System.out.println("等待数据的到来...");
            ds.receive(dp);

            System.out.println("接收到的数据内容是：" + new String(bArr) + "!");
            byte[] bArr2 = "I receive !".getBytes();
            DatagramPacket dp2 = new DatagramPacket(bArr2,bArr2.length,dp.getAddress(),dp.getPort());
            ds.send(dp2);
            System.out.println("回发数据成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        4. 关闭Socket并且释放有关的资源
            if(null != ds) {
                ds.close();
            }
        }


    }
}
