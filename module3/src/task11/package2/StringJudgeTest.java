package task11.package2;

import jdk.swing.interop.SwingInterOpUtils;

public class StringJudgeTest {
    public static void main(String[] args) {
        String str1 = new String("上海自来水来自海上");
        System.out.println("str1 = " + str1);
        for(int i = 0;i < str1.length() / 2;i++) {
            if(str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                System.out.println(str1 + " 不是回文串");
                return;
            }

        }
        System.out.println(str1 + " 是回文串");

    }
}
