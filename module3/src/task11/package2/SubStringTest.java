package task11.package2;

import java.util.Scanner;

public class SubStringTest {
    public static void main(String[] args) {
        String str1 = new String("happy Wife, Happy Life!");
        System.out.println("str1 = " + str1);
        String str2 = str1.substring(1,6);//索引[1,6)
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        String str3 = str1.substring(1);  //从1开始
        System.out.println("str1 = " + str1);
        System.out.println("str3 = " + str3);

        Scanner input = new Scanner(System.in);
        //从输入的字符串中获取指定字符串以后的内容
        System.out.print("请输入主字符串：");
        String str4 = input.next();
        System.out.println();
        System.out.print("请输入子字符串：");
        String str5 = input.next();
        int pos = str4.indexOf(str5);
        if(pos == -1) {
            System.out.println("找不到该子串");
        } else {
            System.out.println(str4.substring(pos + 1));

        }


    }
}
