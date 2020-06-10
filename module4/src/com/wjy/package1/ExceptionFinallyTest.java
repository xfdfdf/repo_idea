package com.wjy.package1;

public class ExceptionFinallyTest {
    public static int test() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            return 0;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 1;
        } finally {
            System.out.println("12");
        }

    }
    public static void main(String[] args) {
        try {
            int ia = 10;
            int ib = 0;
            System.out.println(ia / ib);
        } catch(ArithmeticException e) {
            e.printStackTrace();
            String str = null;
//            System.out.println(str.length());
        } finally {
            System.out.println("无论是否发生异常都记得来执行我喔！");
        }
        System.out.println("Over");
        System.out.println(test());
    }
}
