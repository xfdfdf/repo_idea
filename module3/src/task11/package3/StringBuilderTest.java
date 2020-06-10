package task11.package3;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1);
        System.out.println("容量是：" + sb1.capacity());
        System.out.println("长度是：" + sb1.length());
        System.out.println("***********************");

        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("sb2 = " + sb2);
        System.out.println("容量是：" + sb2.capacity());
        System.out.println("长度是：" + sb2.length());
        System.out.println("***********************");

        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println("sb3 = " + sb3);
        System.out.println("容量是：" + sb3.capacity());
        System.out.println("长度是：" + sb3.length());
        System.out.println("***********************");

        String str1 = new String("hello");
        String str2 = str1.toUpperCase();
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        StringBuilder sb4 = sb3.insert(0,"abcd");
        System.out.println("sb4 = " + sb4);
        System.out.println("sb3 = " + sb3);
        sb4.insert(4,"1234");
        sb4.append("12");
        System.out.println("sb4 = " + sb4);
        sb4.insert(sb4.length() ,"hehehehehe");
        System.out.println("sb4 = " + sb4);
        System.out.println(sb4.length() + "---->>" + sb4.capacity());

        //实现字符串的删除
        sb3.deleteCharAt(8);
        System.out.println("sb3 = " + sb3);
        sb3.delete(1,9);  //[1.9)
        System.out.println("sb3 = " + sb3);
        sb3.delete(4,sb3.length());
        System.out.println("sb3 = " + sb3);

        //实现字符串的修改、查找、以及反转操作
        sb3.setCharAt(0,'e');
        sb3.replace(1,4,"bcd");
        System.out.println("sb3 = " + sb3);
        int pos = sb3.indexOf("b");
        System.out.println("从前往后查找的结果是：" + pos);
        pos = sb3.lastIndexOf("b");
        System.out.println("从后往前查找的结果是：" + pos);
        System.out.println("反转字符串：" + sb3.reverse());

    }
}
