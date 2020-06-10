package task11.package1;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("12");
        BigInteger b2 = new BigInteger("15");

        System.out.println("加法操作：" + b1.add(b2));
        System.out.println("减法操作：" + b1.subtract(b2));
        System.out.println("除法操作：" + b1.divide(b2));
        System.out.println("乘法操作：" + b1.multiply(b2));
        System.out.println("取余操作：" + b1.remainder(b2));
        System.out.println("*********************");
        System.out.println("一次性取得余数和商：");
        BigInteger[] bis = b1.divideAndRemainder(b2);
        for(int i = 0;i < bis.length;i++) {
            System.out.println(bis[i]);
        }
    }
}
