package task11.package2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringRegMethodTest {
    public static void main(String[] args) {

        String str1 = "1001,zhangfei,30";
        System.out.println("str1 = " + str1);
        String[] sArr = str1.split(",");
        for(int i = 0;i < sArr.length;i++) {
            System.out.println(sArr[i]);
        }
        System.out.println("************************************");
        System.out.println("************************************");
        String str2 = "我wo我的小名叫大帅哥";
        String str3 = str2.replace('我','你');
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        str3 = str2.replace('大','小');
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        str3 = str2.replace('小','大');
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("****************************");
        System.out.println("****************************");
        String str6 = "123abc456def789ghi";
        String str7 = str6.replaceFirst("\\d+","#");
        System.out.println("替换的一个字符串的结果是：" + str7);
        String str8 = str7.replaceAll("[a-z]+","A");
        System.out.println("str8 = " + str8);

    }


    @Test
    public void test() {
        Set<String> set1 = new HashSet<String>();
        set1.add("12");
        set1.add("111");
        set1.add("1113");
        set1.add("11111");
        for(String s : set1) {
            System.out.println(s);
        }
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
