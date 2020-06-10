package task11.package4;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {
    public static void main(String[] args) {
        List lt1 = new LinkedList();
        System.out.println("lt1 = " + lt1);
        System.out.println("********************");
        lt1.add(0,"one");
        System.out.println("lt1 = " + lt1);

        lt1.add(1,"two");
        System.out.println("lt1 = " + lt1);
        lt1.add(2,3);
        System.out.println("lt1 = " + lt1);
        System.out.println("************************");
        String str1 = (String) lt1.get(0);
        System.out.println("获取到的元素是：" + str1);

        StringBuilder sb1 = new StringBuilder("[");
        for(int i = 0;i < lt1.size();i++) {
            if(i == lt1.size() - 1) {
                sb1.append(lt1.get(i)).append("]");
            } else {
                sb1.append(lt1.get(i)).append(",");
            }
        }

        System.out.println(sb1);


        //5.查找指定元素出现的索引位置
        System.out.println("one出现的第一个索引位置：" + lt1.indexOf("one"));
        lt1.add("one");
        System.out.println("lt1 = " + lt1);
        System.out.println("one反向查找出现的第一个索引位置：" + lt1.lastIndexOf("one"));
        System.out.println("******************************");
        System.out.println("lt1 = " + lt1);
        //6.实现集合中元素的修改
        Integer t1 = (Integer) lt1.set(2,"three");
        System.out.println("被修改的元素是 = " + t1);
        System.out.println("修改以后的集合元素 = " + lt1);
         String str2 = (String) lt1.set(3,"four");
        System.out.println("被修改的元素是 = " + str2);
        System.out.println("修改以后的集合元素 = " + lt1);
        System.out.println("****************************");

        //7.使用remove方法将集合中的所有元素删除
//        for(int i = lt1.size() - 1;i > -1;i--) {
//            System.out.println("被删除的元素是：" + lt1.remove(i));
//            System.out.println("lt1 = " + lt1);
//        }
        System.out.println("****************************");

        //8.获取当前集合中的子集合，也就是将集合中的一部分内容获取出来，子集合和原集合占用一块内存空间
        List lt2 = lt1.subList(1,3);
        System.out.println("lt2 = " + lt2);
        //删除lt2中元素的数值
        str2 = (String) lt2.remove(0);
        System.out.println("被删除的元素是：" + str2);
        System.out.println("删除后lt2 = " + lt2);
        System.out.println("删除后lt1 = " + lt1);

    }
}
