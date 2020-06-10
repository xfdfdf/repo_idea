package task11.package2;

public class StringCompareTest {
    public static void main(String[] args) {
        String str1 = new String("hello");
        System.out.println("str1 = " + str1);

        System.out.println(str1.compareTo("world"));  //1
        System.out.println(str1.compareTo("haha"));  //1
        System.out.println(str1.compareTo("hehe"));   //1
        System.out.println(str1.compareTo("heihei"));  //1
        System.out.println(str1.compareTo("helloworld")); //0
        System.out.println(str1.compareToIgnoreCase("HELLO"));
    }
}
