package package2;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListPersonTest {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();
        list.add(new Person("zhangfei",30));
        list.add(new Person("xiaoqiao",17));
        list.add(new Person("zhouyu",20));
        list.add(new Person("guangyu",33));
        list.add(new Person("liubei",40));
        list.add(new Person("caocao",39));
        for(Person p : list) {
            System.out.println(p);
        }
        System.out.println("************************");
        List<Person> list1 = new LinkedList<Person>();

        for(Person p : list) {
            if(p.getAge() >= 18) {
                list1.add(p);
            }
        }
        for(Person p : list1) {
            System.out.println(p);
        }
        System.out.println(list1);
        list.stream().filter(new Predicate<Person>() {

            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<Person>() {

            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });
        System.out.println("***********************");
        list.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(person -> {
            System.out.println(person);
        });
        System.out.println("***********************");

        list.stream().filter(person->{
            return person.getAge() >= 18;
        }).forEach(System.out::println);
        System.out.println("***********************");

        list.stream().skip(2).limit(3).forEach(System.out::println);

        System.out.println("***********************");
        list.stream().map(new Function<Person, Integer>() {

            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        }).forEach(System.out::println);

        list.stream().map(person->person.getAge()).forEach(System.out::println);
        list.stream().map(Person::getAge).forEach(System.out::println);
        System.out.println("*************************************");
//        list.stream().sorted().forEach(System.out::println);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("***************************************");
        boolean b = list.stream().noneMatch(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 45;
            }
        });
        System.out.println(b);
        b = list.stream().noneMatch((person) -> {return person.getAge() > 45;});
        System.out.println(b);
        System.out.println("******************************************");
        Optional<Person> max = list.stream().max(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("按照年龄排序后的最大值是：" + max);
        max = list.stream().max((o1,o2)->{
            return o1.getAge() - o2.getAge();
        });
        System.out.println("按照年龄排序后的最大值是：" + max);

        System.out.println("**********************************");
        Optional<Integer> reduce = list.stream().map(Person::getAge).reduce(new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println("最终所有的年龄累加和是：" + reduce);
        reduce = list.stream().map(Person::getAge).reduce(Integer::sum);
        System.out.println("最终所有的年龄累加和是：" + reduce);

        reduce = list.stream().map(Person::getAge).reduce((i,i1) ->{return i+i1;});
        System.out.println("最终所有的年龄累加和是：" + reduce);
        System.out.println("**************************************");
        list.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);

    }
}
