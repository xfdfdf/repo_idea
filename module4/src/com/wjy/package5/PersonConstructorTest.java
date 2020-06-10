package com.wjy.package5;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class PersonConstructorTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner input = new Scanner(System.in);
        //1.使用无参构造Person类型的对象并且打印
        Person p1 = new Person();
        System.out.println("p1 = " + p1);
        System.out.println("************************");
        //2.使用发射的机制创建person对象
        Class c1 = Class.forName("com.wjy.package5.Person");
        Person p2 = (Person) c1.newInstance();
        System.out.println("p2 = " + p2);

        System.out.println("请输入你要创建的类型：");
        String str = input.nextLine();
        Class c2 = Class.forName(str);
        Object o = c2.newInstance();
        System.out.println(o.getClass());
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D://a.txt")));
            String str1 = br.readLine();
            Class c3 = Class.forName(str1);
            System.out.println(c3.newInstance().getClass());


            Constructor constructor = c2.getConstructor(String.class,int.class);
            System.out.println("通过无参构造方法创建的对象是：" + constructor.newInstance("zhangfei",19));
            Constructor[] constructors = c2.getConstructors();
            for(Constructor c : constructors) {
                System.out.println("构造方法的访问修饰符是：" + c.getModifiers());
                System.out.println("构造方法的名称是：" + c.getName());
                System.out.println("构造方法的所有参数类型是：");
                Class[] parameterTypes = c.getParameterTypes();
                for(Class cs : parameterTypes) {
                    System.out.print(cs + "   ");
                }
                System.out.println();
            }
            System.out.println("********************************");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
