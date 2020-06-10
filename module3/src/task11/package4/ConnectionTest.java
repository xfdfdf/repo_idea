package task11.package4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ConnectionTest {
    public static void main(String[] args) {
        //1.准备一个Collection集合并且打印
        Collection c1 = new ArrayList<>();
        //打印集合时，自动调用toString()方法，默认的打印格式为[元素值1，元素值2]
        System.out.println(c1);
        System.out.println("*****************************");
        //2.向集合中添加单个元素并且打印
        boolean b1 = c1.add(new String("one"));
        System.out.println("b1 = " + b1);   //true
        System.out.println("集合中的元素有： " + c1);// [one]

        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1 = " + b1);   //true
        System.out.println("集合中的元素有： " + c1); // [one, 2]

        b1 = c1.add(new Person("zhangfei",30));
        System.out.println("b1 = " + b1);   //true
        System.out.println("集合中的元素有： " + c1); //[one, 2, Person{age=30, name='zhangfei'}]
        System.out.println("********************************************");
//        3.向集合中添加多个元素并且打印
        Collection c2 = new ArrayList<>();
        c2.add("three");
        c2.add(4);
        System.out.println("c2 = " + c2);
        //将c2中的元素全部添加到c1之中，也就是将集合c2中的元素一个一个添加到集合c1之中
        b1 = c1.addAll(c2);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);  //[one, 2, Person{age=30, name='zhangfei'}, three, 4]

        //另外一种方式,add()方法，将c2作为一个整体加入到c1里面
//        b1 = c1.add(c2);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);//[one, 2, Person{age=30, name='zhangfei'}, three, 4, [three, 4]]
        System.out.println("**************************************");
        //4.判断集合之中是否包含参数指定的单个元素
        b1 = c1.contains(new String("one"));
        System.out.println("b1 = " + b1);

        b1 = c1.contains(new String("two"));
        System.out.println("b1 = " + b1);

        b1 = c1.contains(Integer.valueOf(2));
        System.out.println("b1 = " + b1);

        //contains方法的工作原理：Objects.equals(o,e)   :o:contains方法的形式参数，e代表集合中的每个元素
        // equals方法的工作原理如下：
        //public static boolean equals(Object a, Object b) {  a代表person对象，b代表集合已经存在的对象
        //        return (a == b) || (a != null && a.equals(b));
        //    }
        b1 = c1.contains(new Person("zhangfei",30));
        System.out.println("b1 = " + b1);
        System.out.println("***********************************");

        //5.判断当前集合是否包含参数指定集合的所有元素
        Collection c3 = new ArrayList();
        c3.add(4);
        System.out.println("c3 = " + c3);

        //判断集合c1中是否包含集合c3的所有的元素
        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1);

        c3.add("five");
        System.out.println("c3 = " + c3);
        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1);

        //笔试考点
        System.out.println("c2 = " + c2);
        b1 = c1.containsAll(c2);
        System.out.println("b1 = " + b1);

        //判断集合c1中是否拥有集合c2这整体为单位的元素
        b1 = c1.contains(c2);
        System.out.println("b1 = " + b1);

        //6.计算两个集合的交集并且保留到当前集合之中
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        b1 = c2.retainAll(c2);
        System.out.println("b1 = " + b1);  //false ,代表当前集合的元素没有发生变化
        System.out.println("c2 = " + c2);
        b1 = c2.retainAll(c3);
        System.out.println("b1 = " + b1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("********************************");
        //7.实现集合中单个元素的删除操作
        System.out.println("c1 = " + c1);
//        删除指定的单个元素
        b1 = c1.remove(1);
        System.out.println("b1 = " + b1);  //false
        System.out.println("c1 = " + c1);

        b1 = c1.remove("one");
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);

        b1 = c1.remove(new Person("zhangfei",30));
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("***************************");
        //8.实现集合中所有元素的删除操作
        System.out.println("c3 = " + c3);
        //从集合c1中删除集合c3中的所有元素，本质上就是一个一个删除，有元素就删除，没有就跳过
        b1 = c1.removeAll(c3);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);


        //笔试考点
        b1 = c1.remove(c3);
        System.out.println("b1 = " + b1);
        b1 = c1.removeAll(c3);
        System.out.println("b1 = " + b1);
        c1.addAll(c3);
        c1.add(c3);
        System.out.println("c1 = " + c1 );


        b1 = c1.remove(c3);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1 );

        b1 = c1.removeAll(c3);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1 );

        System.out.println("*************************");
//        9.实现集合中其他方法的测试 ctrl+n:实现类的搜索，ctrl+f12:找到类的方法
        System.out.println("集合中元素的个数为：" + c1.size());
        System.out.println(0 == c1.size() ? "集合为空":"集合不为空");
        System.out.println(c1.isEmpty() ? "集合已经空了":"集合不为空");
        //清空集合的所有元素
        c1.clear();
        System.out.println("集合中元素的个数为：" + c1.size());
        System.out.println(0 == c1.size() ? "集合为空":"集合不为空");
        System.out.println(c1.isEmpty() ? "集合已经空了":"集合不为空");

//        准备两个集合并且判断是否相等
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        System.out.println("c4 = " + c4);
        Collection c5 = new ArrayList();
        c5.add(1);
        c5.add(2);
//        c5.add(3);
        System.out. println("c5 = " + c5);
        //判断是否相等
        b1 = c4.equals(c5);
        System.out.println("b1 = " + b1);

        System.out.println("*****************************");
        //10.实现集合和数组类型的转换，通常认为：集合是用于取代数组的结构
//        实现集合转为数组
        Object[] objects = c5.toArray();
        System.out.println(Arrays.toString(objects));
        //数组转为集合
        Collection objects1 = Arrays.asList(objects);
        System.out.println(objects1);

    }
}
