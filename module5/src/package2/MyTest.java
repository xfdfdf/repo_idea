package package2;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        String str1 = input.next();
       String str2 =  input.nextLine();
        System.out.print(str1);
        System.out.print(str2);
        System.out.println("as");
    }
}
