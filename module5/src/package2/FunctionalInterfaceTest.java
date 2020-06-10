package package2;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //1.匿名内部类的语法格式：父类/接口类型 引用变量名 = new 父类/接口类型(){方法的重写};
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println("我是既没有参数又没有返回值的方法！");
            }
        };
        runnable.run();    //我是既没有参数又没有返回值的方法

        //使用lambda表达式实现函数式接口对象的创建：（参数列表）-> {方法体}
        Runnable runnable1 = ()-> System.out.println("我是既没有参数又没有返回值的方法！");
        Runnable runnable2 = ()-> {System.out.println("我是既没有参数又没有返回值的方法！");};
        System.out.print("runnable1: ");
        runnable1.run();
        System.out.print("runnable2: ");

        runnable2.run();

        System.out.println("----------------------------------");
        Consumer consumer = new Consumer() {

            @Override
            public void accept(Object o) {

                System.out.println(o + "有成熟但是没有返回值的方法就是我！");
            }
        };
        consumer.accept("友情提示");  //友情提示有成熟但是没有返回值的方法就是我！
        Consumer consumer1 = (Object o) -> System.out.println(o + "有成熟但是没有返回值的方法就是我！");
//        Consumer consumer1 = (o) -> System.out.println(o + "有成熟但是没有返回值的方法就是我！");
        Consumer consumer2 = (o) -> {System.out.println(o + "有成熟但是没有返回值的方法就是我！");};
        //省略了参数类型，进行自动类型推断、（）、｛｝
        Consumer consumer3 = o -> {System.out.println(o + "有成熟但是没有返回值的方法就是我！");};
        System.out.print("consumer1 : ");
        consumer1.accept("consumer1");
        System.out.print("consumer2 : ");
        consumer2.accept("consumer2");
        System.out.print("consumer3 : ");
        consumer3.accept("consumer3");


        System.out.println("----------------------------------");
        Supplier suppiler = new Supplier(){

            @Override
            public Object get() {
                return "无参有返回值";
            }
        };
        System.out.println(suppiler.get());  //无参有返回值
        Supplier supplier1 = () -> {return "supplier1";};
        Supplier supplier2 = () ->  "supplier2";
        System.out.println(supplier1.get());  //无参有返回值
        System.out.println(supplier2.get());  //无参有返回值

        System.out.println("----------------------------------");

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o ;
            }
        };
        System.out.println(function.apply("有参有返回值的方法"));//有参有返回值的方法
        Function function1 = o -> o;
        Function function2 = (o) -> {return o;};
        Function function3 = (o) ->  o;
        System.out.println(function1.apply("function1"));
        System.out.println(function2.apply("function2"));
        System.out.println(function3.apply("function3"));
        System.out.println("----------------------------------");
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        System.out.println(comparator.compare(10,20));  //0
        Comparator comparator1 = (o1,o2) -> 0;
        System.out.println(comparator1.compare(11,22));
        System.out.println("----------------------------------------");
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        System.out.println(predicate.test("hello"));
        Predicate predicate1 = o -> {
            return false;
        };
        System.out.println(predicate1.test("ppp"));
    }
}
