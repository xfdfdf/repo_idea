package task11.package2;

public class StringPoolTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello1";
        System.out.println(str1 == str2);
        System.out.println(str3 == str2);
        System.out.println(str1 == str3);
    }
}
