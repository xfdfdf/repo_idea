package com.wjy.homework.work2;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * 2. 编程题
 *
 *   实现将指定目录中的所有内容删除，包含子目录中的内容都要全部删除。
 */
public class DeleteDirector {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要删除的目录名称：");
        String filePath = input.nextLine();
        File file = new File(filePath);

        deleteFile(file);
    }

    public static void deleteFile(File file) {
        if(file.isFile()) {
            file.delete();
            System.out.println("1.文件 " + file.getName() + "删除成功");
            sum++;

        } else if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File f : files) {
                deleteFile(f);
            }
            file.delete();
            System.out.println("*****2.目录 " + file.getName() + "删除成功");
            sum++;
        }

    }

}
