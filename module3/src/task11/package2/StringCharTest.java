package task11.package2;

public class StringCharTest {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println("str1 = " + str1);
        System.out.println("***********************");
        for(int i = 0;i < str1.length();i++) {
            System.out.println("下标为 " + i + "所对应的值是 " + str1.charAt(i));
        }
        System.out.println("*************************");
        System.out.println(str1.length() == 0 ? "字符串为空":"字符串不为空");
        System.out.println(str1.isEmpty()? "字符串为空":"字符串不为空");
        String str2 = "12345";
        int ia = Integer.parseInt(str2);
        System.out.println(Integer.parseInt(str2));
        System.out.println(ia);
        System.out.println((int)'0');
        System.out.println((int)'9');
        int sum = 0;
        for(int i = 0;i < str2.length();i++) {
            sum = sum * 10 + (str2.charAt(i) - 48);
        }
        System.out.println(sum);
    }
}
