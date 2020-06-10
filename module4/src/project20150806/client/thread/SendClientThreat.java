package project20150806.client.thread;

import com.wjy.homework.work3.CopyDirector;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//发送信息线程
public class SendClientThreat implements Runnable {
    private String name;
    Socket socket;
    PrintWriter pWriter;
    Scanner scanner;

    public SendClientThreat(String name,Socket socket) {
        super();
        this.socket = socket;
        this.scanner = new Scanner(System.in);
        this.name = name;
        try {
            pWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true) {
            System.out.print(name + ",你好，请输入要发送的数据，想发送文件的话输入(发送文件),想复制文件输入(复制文件)：");
            String  str = scanner.nextLine();
            if("发送文件".equals(str)) {


                System.out.print("请输入要复制的文件路径：");
                String copyFilePath = scanner.nextLine();
                File copyFile = new File(copyFilePath);

                File srcFile = new File("F:\\聊天室文件夹");
                copyDirector(copyFile,srcFile);
                System.out.println( "发送文件成功，文件名是：" + copyFile.getName());
            }else if("复制文件".equals(str)) {
                File f = new File("F:\\聊天室文件夹");
                System.out.println("存在的文件名字是：");
                File[] files = f.listFiles();
                for(File ff : files) {
                    System.out.println(ff.getName());
                }
                System.out.println("请输入要下载的文件名称：");
                String fileName = scanner.nextLine();
                System.out.println("请输入要下载的文件路径：");
                String filePath = scanner.nextLine();
                boolean isFlag = false;
                for(File ff : files) {
                    if(fileName.equals(ff.getName())) {
                        copyDirector(ff.getAbsoluteFile(),new File(filePath));
                        System.out.println("文件复制成功");
                        isFlag = true;
                    }
                }
                if(isFlag == false) {
                    System.out.println("文件复制失败，请重新输入");
                }



            }
            else {
                String strMsg =name +  " : " + str;
                pWriter.println( strMsg);
                pWriter.flush();
            }


//System.out.println(strMsg);
        }

    }


    public static void copyDirector(File copyFile, File srcFile) {
        if(!copyFile.exists() || !srcFile.exists()) {
            System.out.println("复制目录或者待拷贝目录不存在，请重新输入");
            return;
        }
        if(srcFile.isFile()) {
            System.out.println("待拷贝的文件不是目录，请重新选择");
            return;
        } else {
            if(copyFile.isFile()) {
                FileInputStream fis = null;
                FileOutputStream fos = null;
                try {
                    fis = new FileInputStream(copyFile);
                    byte[] bytes = new byte[1024];
                    File f = new File(srcFile + "\\" + copyFile.getName());
                    fos = new FileOutputStream(f);
                    int length = -1;
                    while((length = fis.read(bytes)) != -1) {
                        fos.write(bytes,0,length);
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if(null != fos){
                            fos.close();
                        }
                        if(null != fis){
                            fis.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else if(copyFile.isDirectory()) {

                String path = srcFile.getAbsolutePath() + "\\" + copyFile.getName();
                File f = new File(path);
                f.mkdir();
                File[] files = copyFile.listFiles();
                for(File fs : files) {
                    copyDirector(fs,f);

                }
            }
        }

    }
}
