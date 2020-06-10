package lesson1;

import jdk.jfr.StackTrace;

//作业5
public class Work5 {


    public static void main(String[] args) {

        //定义一个数组,存放第一行的字符
        char[] number = new char[17];
        number[0] = ' ';
        for (int i = 1; i < number.length; i++) {
            if (i <= 10) {
                number[i] = (char) (48 + i - 1);

            } else {
                number[i] = (char) ('a' + i - 11);
            }
        }



        //定义五子棋的棋盘
        char[][] char1 = new char[17][17];
        //给数组的元素赋值
        for (int i = 0; i < char1.length; i++) {
            for (int j = 0; j < char1[i].length; j++) {
                if (i == 0) {
                    char1[i][j] = number[j];
                } else {

                    if (i != 0 && j == 0) {
                        char1[i][j] = number[i];

                    } else {
                        char1[i][j] = '+';
                    }

                }
            }
        }

        //输出
        for (int i = 0; i < char1.length; i++) {
            for (int j = 0; j < char1[i].length; j++) {
                System.out.print(char1[i][j] + " ");

            }
            System.out.println();
        }


    }




}