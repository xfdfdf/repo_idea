package task11.homework;

import org.junit.Test;

import java.util.*;

/**
 * 作业2，获取两个字符串中最大的相同字串
 */
public class work2 {
    private static Set<String> set = new HashSet<String>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1.定义字符串1
        System.out.print("请输入字符串1：");
        String str1 = input.next();
        //2.定义字符串2
        System.out.print("请输入字符串2：");
        String str2 = input.next();
        //3.比较字符串的长度大小，字符串1大于字符串2
        if(str1.length() > str2.length()) {
            selectMaxZiChuang( str1,str2);
        } else if(str1.length() < str2.length()) {                   //4.比较字符串的长度大小，字符串2大于字符串1

            selectMaxZiChuang( str2,str1);

        } else {          //5.比较字符串的长度大小，字符串1==字符串2

            selectMaxZiChuang( str1,str2);

        }

        //6.输出最大相同的子字符串
        returnMaxNumString();


    }

    //7.定义一个方法存储所有有共同内容的子字符串
    public static void selectMaxZiChuang(String s1,String s2) {

        if(s1.contains(s2)) {
            set.add(s2);
            return;
        } else {
            if(s2.length() > 0) {
                String s = s2.substring(0,s2.length()-1 );
                selectMaxZiChuang(s1,s);
                String ss = s2.substring(1,s2.length() );
             selectMaxZiChuang(s1,ss);

            } else {
                System.out.println("无字符串匹配");
                return;
            }
        }
    }


    //8.打印最长子字符串的方法
    public static void returnMaxNumString() {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if(set.size() == 0) {
            System.out.println("两个字符串之间无相同内容的字符串");
            return ;
        }
        for(String s : set) {
            list.add(s);
        }
        int max = 0;
        for(int i = 1;i < list.size();i++) {
            if(list.get(max).length() < list.get(i).length()) {
                max = i;
            }
        }

        for(int i = 0;i < list.size();i++) {
            if(list.get(max).length() == list.get(i).length()) {
                list1.add(i);
            }
        }

        for(int i = 0;i < list1.size();i++) {
           String str =  list.get(list1.get(i));
            System.out.println("最大相同字串为：" + str);
        }




    }
}
