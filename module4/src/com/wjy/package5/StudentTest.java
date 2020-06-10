package com.wjy.package5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("com.wjy.package5.Student");
        System.out.println("获取到的包的信息是：" + c1.getPackageName());
        System.out.println("获取到的父类的信息是：" + c1.getSuperclass());
        System.out.println("********************************");
        System.out.println("获取到的接口的信息是：");
        Class[] interfaces = c1.getInterfaces();
        for(Class c : interfaces  ) {
            System.out.print(c + "  ");
        }
        System.out.println("************************************");
        System.out.println("获取到的注解信息是：");
        Annotation[] annotations = c1.getAnnotations();
        for(Annotation a : annotations) {
            System.out.print(a + "  ");
        }
        System.out.println("***********************************");
        System.out.println("获取到的泛型信息是：");
        Type[] genericInterfaces = c1.getGenericInterfaces();
        for(Type t : genericInterfaces) {
            System.out.println(t + "  ");
        }


    }
}
