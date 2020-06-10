import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class MyTest implements  Cloneable {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket s = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("等待客户端连接");
            s = serverSocket.accept();
            System.out.println("客户端连接成功");
            InputStream is = s.getInputStream();
            byte[] b = new byte[1024];
            int length = -1;
            if((length = is.read(b)) != -1) {
                System.out.println("服务器收到：" + new String(b,0,length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void SocketClient() {
        Socket s = null;
        try {
            s = new Socket("localhost",8888);
           PrintStream ps = new PrintStream( s.getOutputStream());
           ps.println("服务器，你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test1() {
        String str1 = "通话";
        String str2 = "重地";
        String str3 = "重de";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        File file = new File("D://a.txt");
        Queue queue = new LinkedList();
        queue.add("1");
        System.out.println(queue);

        queue.add("2");
        System.out.println(queue);
        queue.add("3");
        System.out.println(queue);
        queue.remove();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);


    }


}
