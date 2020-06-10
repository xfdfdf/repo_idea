package task11.package2;

import java.util.Scanner;

public class StringRegTest {
    public static void main(String[] args) {
        //1.定义正则表达式的字符串
        //判断用户得到输入是否符合正则表达式的要求   ^$可以省略
//        String reg = "\\d{6}";
//        String reg = "[0-9]{6}";
        //定义QQ号的正则表达式，要求是非0开头的5-15位数字组成。
//        String reg = "[1-9][0-9]{4,14}";
// 定义手机号码的正则表达式，要求是1开头的第二位数字是3，4，5，7，8中的一位，11位数字组成。
//        String reg = "1[34578]\\d{9}";
        // 验证身份证号码，一共18位，6位数字表示地区，4位数字表示年，2位数字表示月，2位数字表示日期，3位数字代表个人，最后一个数字可能是X。
        String reg = "(\\d{6})(\\d{4})(\\d{2})\\d{2}\\d{3}[0-9|X]";

        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的银行卡密码：");
        String password = input.next();
        while(true) {
            if(password.matches(reg)) {
                System.out.println("输入格式正确");
                break;
            } else {
                System.out.print("输入格式错误,请重新输入:");
                password = input.next();
            }
        }
    }
}
