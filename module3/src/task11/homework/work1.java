package task11.homework;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * 作业1
 * 统计字符串的各种字符个数
 */
public class work1 {
    public static void main(String[] args) {
        String str = "ABCD123!@#$%ab";
        int UpperNum = 0;  //大写字符的个数
        int LowerNum = 0;  //小写字符的个数
        int NumberNum = 0;  //数字字符的个数
        int OtherNum = 0;  //其他字符的个数
        for(int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if(c >='A' && c <= 'Z') {         //统计大写字符的个数，满足添加大写字符个数加1
                UpperNum++;
            } else if(c >='a' && c <= 'z') {  //统计小写字符的个数，满足添加小写字符个数加1
                LowerNum++;
            } else if(c >= '0' && c <= '9') { //统计数字字符的个数，满足添加数字字符个数加1
                NumberNum++;
            } else {                          //统计其他字符的个数，满足添加其他字符个数加1
                OtherNum++;
            }
        }

        System.out.println("字符串 " + str + "中大写字符的个数为：" + UpperNum + ",小写字符个数为：" + LowerNum
         + ",数字字符的个数为：" + NumberNum + ",其他字符的个数为：" + OtherNum);
    }
}
