package task11.package5;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        //1.准备一个集合并且初始化
        List<Integer> lt1 = Arrays.asList(10,30,20,50,45);
        //2.实现集合中元素的各种操作
        System.out.println("集合中最大元素值是：" + Collections.max(lt1));
        System.out.println("集合中最小元素值是：" + Collections.min(lt1));

        //2.实现集合中元素的反转
        Collections.reverse(lt1);
        System.out.println("lt1 = " +lt1);
        //实现两个元素的交换
        Collections.swap(lt1,0,1);
        System.out.println("交换后，lt1 = " + lt1);
//        实现元素的排序
        Collections.sort(lt1);
        System.out.println("排序以后，lt1 = " + lt1);
//        随机置换
        Collections.shuffle(lt1);
        System.out.println("随机置换以后：" + lt1);
//        实现集合之间的拷贝
        List<Integer> lt2 = new ArrayList<Integer>(6);
        List<Integer> lt3 = Arrays.asList(new Integer[8]);
        lt2.add(0);
        lt2.add(0);
        lt2.add(0);
        lt2.add(0);
        lt2.add(0);
        System.out.println("lt1 = " + lt1.size());
        System.out.println("lt2 = " + lt2.size());
        //前面的是待拷贝数组，后面得到是原数组
        Collections.copy(lt2,lt1);
        Collections.copy(lt3,lt1);
        System.out.println("lt1 = " + lt1);
        System.out.println("lt2 = " + lt2);
        System.out.println("lt3 = " + lt3);
    }
}
