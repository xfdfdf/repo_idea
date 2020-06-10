package com.wjy.package5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {
    public static void main(String[] args) throws Exception {
        Person p = new Person("zhangfei", 30);

        System.out.println("************************");


        Class c1 = Class.forName("com.wjy.package5.Person");
        Constructor constructor = c1.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("zhangfei", 30);
        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);
        Object o = field.get(obj);
        System.out.println("获取到的成员变量：" + o);
        System.out.println("*****************************");
        //修改对象obj里面name变量的属性值
        field.set(obj,"guangyu");
        System.out.println("修改以后的成员变量的值：" + field.get(obj));
        System.out.println("***********************************");

        //获取全部的成员变量
        Field[] fields = c1.getFields();
        for(Field f : fields) {
            System.out.println("变量的名字是：" + f.getName());
            System.out.println("变量的修饰符是：" + f.getModifiers());
            System.out.println("变量的数据类型是：" + f.getType());
            System.out.println();
        }

    }
}
