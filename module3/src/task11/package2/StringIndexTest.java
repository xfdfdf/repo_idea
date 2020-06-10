package task11.package2;

import java.util.Scanner;

public class StringIndexTest {
    public static void main(String[] args) {
        String str1 = new String("Good 2Good Study,Day Day Up!");
        System.out.println("str1 = " + str1);

        int pos = str1.indexOf('g');
        System.out.println("pos = " + pos);
        pos = str1.indexOf('G');
        System.out.println("pos = " + pos);
        pos = str1.indexOf('G',0);
        System.out.println("pos = " + pos);
        pos = str1.indexOf('G',1);
        System.out.println("pos = " + pos);
        System.out.println("***********************");
        pos = str1.indexOf("day");
        System.out.println("pos = " + pos);
        pos = str1.indexOf("Day");
        System.out.println("pos = " + pos);
        pos = str1.indexOf((int)'d');
        System.out.println("pos = " + pos);
//        //编写通用的代码将str1的重复字符下标找出
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入你要找的字符: " +
//                "");
//        String str2 = input.next();
//        int i = 0;
//        while(true) {
//           i  = str1.indexOf(str2,i);
//            if(i == -1) {
//                break;
//            } else {
//                System.out.print(i + "  ");
//                i += 1;
//
//            }
//        }

        System.out.println("******************************");
        //3.实现字符和字符串的反向查找
        pos = str1.lastIndexOf('G');
        System.out.println("pos = " + pos);
        pos = str1.lastIndexOf('G',6);
        System.out.println("pos = " + pos);

        pos = str1.lastIndexOf('G',5);
        System.out.println("pos = " + pos);
        System.out.println("*********************************");
        pos = str1.lastIndexOf("Day");
        System.out.println("pos = " + pos);

        pos = str1.lastIndexOf("Day",21);
        System.out.println("pos = " + pos);

        pos = str1.lastIndexOf("Day",20);
        System.out.println("pos = " + pos);


    }
}
