package task11.package1;

public class IntegerTest {
    public static void main(String[] args) {
        //1.打印Integer类中常用的常量数值
        System.out.println("最大值是：" + Integer.MAX_VALUE);
        System.out.println("最小值是：" + Integer.MIN_VALUE);
        System.out.println("所表示的二进制的位数是：" + Integer.SIZE);
        System.out.println("所占的字节个数是：" + Integer.BYTES);
        System.out.println("对应的int类型的Class实例是：" + Integer.TYPE);
        System.out.println("**********************************");

        //2.使用构造方法来构造Integer类型的对象并且打印
        Integer it1 = new Integer(123);
        System.out.println("it1 = " + it1);
        Integer it2 = new Integer("456");
        System.out.println("it2 = " + it2);
        //上述的方法已经过时，建议使用valueOf方法取代，相当于从int类型转换为Integer类型的转换
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3 = " + it3);
        //相当于从String类型转换为Integer类型
        Integer it4 = Integer.valueOf("456");
        System.out.println("it4 = " + + it4 + it4.getClass());
        //获取调用对象中的整型数值,程度与从Integer类型转为int类型
        int ia = it4.intValue();
        System.out.println("获取到的整数数据是: " + ia);
        System.out.println("***********************************");
        System.out.println("***********************************");
        //装箱与拆箱
        Integer i1 = 12;
        int i = i1;

        Integer it6 = 127;
        Integer it7 = 127;
        Integer it8 = new Integer(128);
        Integer it9 = new Integer(128);
        System.out.println(it6 == it7);
        System.out.println(it6.equals(it7));
        System.out.println(it8 == it9);
        System.out.println(it8.equals(it9));

        System.out.println(Integer.toString(200).getClass());
        System.out.println(Integer.toString(200));
        System.out.println("*****************************");
        System.out.println(Integer.toHexString(200));
        System.out.println(Integer.toString(200,16));

        System.out.println(Integer.toOctalString(200));
        System.out.println(Integer.toString(200,8));

        System.out.println(Integer.toBinaryString(200));
        System.out.println(Integer.toString(200,2));
        IntegerTest.inner s = new IntegerTest.inner();


    }
    public static class inner {
        private int age = 10;

    }
}
