package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入杨辉三角的行数：");
        int linenum = input.nextInt();
        int[][] yanhui = new int[linenum][];
        for(int i = 0;i < yanhui.length;i++) {
            yanhui[i] = new int[i + 1];

            for(int j = 0;j <= i;j++) {
                if(0 == j || i == j) {
                    yanhui[i][j] = 1;

                } else {
                    yanhui[i][j] = yanhui[i - 1][j] + yanhui[i - 1][j - 1];

                }
            }
        }

        for(int i = 0;i < yanhui.length;i++) {
            for(int j = 0;j <= i;j++) {
                System.out.print(yanhui[i][j] + "");
            }
            System.out.println();
        }

    }
}
