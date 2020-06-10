package lesson1;

import java.util.Scanner;

//1. 编程题 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
public class Work1 {
    public static void main(String[] args) {

        int[] yesYear = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};  //是闰年
        int[] noYear = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};   //不是闰年

        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = input.nextInt();
        System.out.print("请输入月份: ");
        int month = input.nextInt();
        System.out.print("请输入日期: ");
        int day = input.nextInt();
        int days = 0;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            //是闰年

            days =  getDays(yesYear,year,month,day);
        } else {
            //不是闰年
            days =  getDays(noYear,year,month,day);

        }

        System.out.println("是今年的第 " + days + "天");



    }


    //返回天数的函数
    public static int getDays(int[] yearDays,int year,int month,int day) {
        int days = 0;
        if(month > 12 || day > yearDays[month]) {
            throw new IllegalArgumentException("输入的月份或者几号不对，请重新输入！");
        }
        for(int i = 1;i < month;i++) {
            days += yearDays[i];

        }
        days += day;
        return days;
    }
}