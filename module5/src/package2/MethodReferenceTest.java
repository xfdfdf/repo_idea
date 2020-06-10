package package2;

import org.junit.Test;

import javax.print.attribute.IntegerSyntax;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        List list =  new ArrayList();
        list.add(12);
        Object[] toArray = list.toArray();
        System.out.println(toArray);
        String[] strs = new String[]{"11","22"};
        System.out.println(strs);


        stack.push("12");
        System.out.println(stack);
        Person p = new Person("zhangfei",30);
        //使用匿名内部类的方式通过函数式接口Runnable中的方法实现对Person类中show()方法的调用
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                Person p = new Person();
                p.show();
            }
        };
        runnable.run();

        //使用lambda表达式调用p对象的show（）方法
        Runnable runnable1 = () -> {

            p.show();
        };
        runnable1.run();
//        方法的引用调用show（）方法
        Runnable runnable2 = new Person()::show;
        runnable2.run();
        System.out.println("********************************");


        Consumer<String> consumer = new Consumer<>() {

            @Override
            public void accept(String o) {
                p.setName(o);
            }
        };
        consumer.accept("guangyu");
        System.out.println(p);
        Consumer<String> consumer1 = o -> {
            p.setName(o);
        };
        consumer1.accept("liubei");
        System.out.println(p);
        Consumer<String> consumer2 = p::setName;
        consumer2.accept("caocao");
        System.out.println(p);
        System.out.println("******************************");
        Supplier<String> supplier = new Supplier<String>() {

            @Override
            public String get() {
                return p.getName();
            }
        };
        System.out.println(supplier.get());
        Supplier supplier1 = () -> {
            return p.getName();
        };
        System.out.println(supplier1.get());
        Supplier supplier2 = p::getName;
        System.out.println(supplier2.get());

        Function<String,Integer> function = new Function<String,Integer>(){

            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(function.apply("12345"));
        Function function1 = s -> {
            return Integer.parseInt((String) s);
        };
        System.out.println(function.apply("12345"));
        Function<String,Integer> function2 = Integer :: parseInt;
        System.out.println(function2.apply("12345"));
        System.out.println("----------------------------------");

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(comparator.compare(12,1));
        Comparator<Integer> comparator1 = (o1,o2) ->{
            return Integer.compare(o1,o2);

        };
        System.out.println(comparator1.compare(12,1));
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(12,111));
        System.out.println("********************************");
        //一个参数作为调用对象调用方法时，可以使用类名::非静态方法调用方法
        Comparator<Integer> comparator3 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator3.compare(12,111));

        Comparator<Integer> comparator4 = (o1,o2)->{
            return o1.compareTo(o2);
        };
        System.out.println(comparator4.compare(12,111));
        Comparator<Integer> comparator5 = Integer::compareTo;
        System.out.println(comparator5.compare(12,111));
        System.out.println("********************************");
        Supplier<Person> supplier3 = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };
        System.out.println(supplier.get());
        Supplier<Person> supplier4 = () ->{
            return new Person();
        };
        Supplier<Person> supplier5 = Person::new;
        System.out.println(supplier3.get());
        System.out.println(supplier4.get());
        System.out.println(supplier5.get());
        System.out.println("**************************");
        BiFunction<String,Integer,Person> biFunction = new BiFunction<String, Integer, Person>() {
            @Override
            public Person apply(String s, Integer integer) {
                return new Person(s,integer);
            }
        };
        System.out.println(biFunction.apply("zhangfei",30));
        BiFunction<String,Integer,Person> biFunction1 = (s,i) ->{
            return new Person(s,i);
        };
        System.out.println(biFunction1.apply("zhangfei",30));
        BiFunction<String,Integer,Person> biFunction2 = Person::new;
        System.out.println(biFunction2.apply("zhangfei",30));
        System.out.println("***************************************");
        Function<Integer,Person[]> function3 = new Function<Integer, Person[]>() {
            @Override
            public Person[] apply(Integer integer) {
                return new Person[integer];
            }
        };
        Person[] ps = function3.apply(3);
        for(Person p1 : ps) {
            System.out.println(p1);
        }
        Function<Integer,Person[]> function4 = (i) ->{
            return new Person[i];
        };
        ps = function4.apply(3);
        for(Person p1 : ps) {
            System.out.println(p1);
        }
        Function<Integer,Person[]> function5 = Person[]::new;
        ps = function4.apply(3);
        for(Person p1 : ps) {
            System.out.println(p1);
        }
    }


}
