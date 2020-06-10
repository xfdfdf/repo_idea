package com.wjy.homework.work3;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class CopyDirectorThread extends Thread {


    @Override
    public  void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要复制的文件路径：");
        String copyFilePath = input.nextLine();
        File copyFile = new File(copyFilePath);
        System.out.print("请输入待拷贝的文件路径：");
        String srcFilePath = input.nextLine();
        File srcFile = new File(srcFilePath);
        synchronized(copyFile) {
            copyDirector(copyFile,srcFile);

        }



    }
    public static void copyDirector(File copyFile,File srcFile) {
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
