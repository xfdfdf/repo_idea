package com.wjy.package1;

import org.w3c.dom.ls.LSOutput;

public class ExceptionPreventTest {

    public static void main(String[] args) {
        //1.会发生算数异常
        int ia = 10;
        int ib = 0;
        if(0 != ib) {
            System.out.println(ia / ib);

        }

        //2.数组下标越界异常
        int[] arr = new int[5];
        int pos = 5;
        if(pos >= 0 && pos < arr.length) {
            System.out.println(arr[5]);

        }

        //3.发生空指针异常
        String str = null;
        if(null != str) {
            System.out.println(str.length());

        }

        //4.类型转换异常
        Object obj = new Object();
        if(obj instanceof Exception) {
            Exception e = (Exception) obj;

        }

        //5.数字格式异常
        String str1 = "123a";
        if(str1.matches("\\d+")){
            System.out.println(Integer.valueOf(str1));

        }
        System.out.println("程序正常结束");
    }
}
