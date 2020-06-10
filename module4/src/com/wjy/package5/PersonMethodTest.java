package com.wjy.package5;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.wjy.package5.Person");
        Constructor constructor = c.getConstructor(String.class,int.class);
        Object o = constructor.newInstance("zhangfei",21);
        Method m1 = c.getMethod("getName");
        System.out.println(m1.invoke(o));

        Method[] methods = c.getMethods();
        for(Method m : methods){
            System.out.println("方法名字：" + m.getName());
            System.out.println("方法的修饰符：" + m.getModifiers());
            System.out.println("方法的返回值类型 ：" + m.getReturnType());
            Class[] classs = m.getParameterTypes();
            System.out.print("方法里面的参数类型：");
            for(Class ca : classs) {
                System.out.print(ca + "  ");
            }
            System.out.println();
            System.out.println();
            Class[] es = m.getExceptionTypes();
            System.out.print("方法里面的异常信息：");
            for(Class ca : es) {
                System.out.print(ca + "  ");
            }
            System.out.println();
            System.out.println("***********************************");
            System.out.println("***********************************");
        }
    }

 }
