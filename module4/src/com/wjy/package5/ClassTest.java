package com.wjy.package5;

public class ClassTest {
    public static void main(String[] args) {
        //1.使用数据类型.class的方式来获取对应的Class对象
        Class c1 = String.class;
        System.out.println("c1 = " + c1);
        c1 = int.class;
        System.out.println("c1 = " + c1);
        c1 = void.class;
        System.out.println("c1 = " + c1);
        System.out.println("*****************************");

//        2.使用对象.getClass()的方式获取对应的Class对象
        String str1 = new String("hello");
        c1 = str1.getClass();
        System.out.println("c1 = " + c1);

        Integer it1 = 20;
        c1 = it1.getClass();
        System.out.println("c1 = " + c1);
        int num = 5;
//        num.getClass()    Error
        System.out.println("******************************");
        //3.使用包装类.TYPE的方式获取基本数据类型的Class对象
        c1 = Integer.TYPE;
        System.out.println("c1 = " + c1);
        c1 = Integer.class;
        System.out.println("c1 = " + c1);
        System.out.println("********************************");
        //4.使用Class.forName("包名加类名);
        try {
            c1 = Class.forName("java.lang.String");
            System.out.println("c1 = " + c1);

            c1 = Class.forName("java.util.Date");
            System.out.println("c1 = " + c1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("***************************");
//        5.使用ClassLoader类加载器
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        try {
            c1 = classLoader.loadClass("java.lang.Integer");
            System.out.println("c1 = " + c1);
            c1 = classLoader.loadClass("java.lang.String");
            System.out.println("c1 = " + c1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
