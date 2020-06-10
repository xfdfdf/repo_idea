package task11.package2;

public class StringConstructorTest {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1 = " + str1);
        System.out.println("******************************");
        byte[] bArr = {97,98,99,100};
        String str2 = new String(bArr,1,3);
        System.out.println("str2 = " + str2);
        System.out.println("***********************");
        String str3 = new String(bArr);
        System.out.println("str3 = " + str3);
        System.out.println("**************************");
        char[] cArr = {'a','d','a','e','p'};
        String str4 = new String(cArr,1,3);
        System.out.println("str4 = " + str4);
        String str5 = new String(cArr);
        System.out.println("str5 = " + str5);
        System.out.println("****************");
        String str6 = new String("helloworld");
        System.out.println(str6);

    }
}
