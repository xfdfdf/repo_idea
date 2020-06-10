package Homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端已启动");
        File file=new File("Example");
        file.mkdirs();
        File file2=new File("Example\\a.txt");
        Socket socket=null;
        InputStream is=null;
        OutputStream os=null;
        FileInputStream fis=null;
        try {
            socket=new Socket("localhost",8889);
            is=socket.getInputStream();
            fis=new FileInputStream(file2);
            os=socket.getOutputStream();

            byte[] bs=new byte[1024];
            int count=0;
            //发送文件
            while((count=fis.read(bs))!=-1){
                os.write(bs, 0, count);
                os.flush();
            }
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

}