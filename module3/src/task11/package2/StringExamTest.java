package task11.package2;

public class StringExamTest {
    public static void main(String[] args) {

//        String str1 = "hello";  //在栈区创建了一个对象指向常量池。   一共创建了一个对象。
//        String str2 = new String("hello");

        //2.常量池和栈区对象的比较啊
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str2 == str4);
        System.out.println(str2.equals(str4));

        String str5 = "hello";
        String str6 = "hel" + "lo";
        System.out.println(str5 == str6);

        String str7 = "hel";
        String str8 = str7 + "lo";
        System.out.println(str5 == str7);
    }
}
