package task11.package2;

import java.util.Scanner;

public class StringEqualsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = null;
        String password = null;
        for(int i = 0;i < 3;i++) {
            System.out.print("请输入您的用户名和密码：");
            username = input.next();
            password = input.next();
            if("admin".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
                System.out.println("欢迎 " + username + "登陆成功");
                break;
            } else {
                if(i == 2) {
                    System.out.println("机会用完，请联系管理员");
                } else {
                    System.out.println("输入错误，请重新输入,你还有 " + (2 - i) + "次机会");

                }
            }
        }
    }
}
