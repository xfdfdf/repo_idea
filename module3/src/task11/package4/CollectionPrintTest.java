package task11.package4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPrintTest {
    public static void main(String[] args) {
//        1.准备一个Collection集合并且放入元素后打印
         Collection c1 = new ArrayList();
         c1.add("one");
         c1.add(2);
         c1.add(new Person("zhangfei",30));
         //方式1：打印集合名称
        System.out.println("c1 = " + c1);
        Iterator iterator1 = c1.iterator();
        StringBuilder sb1 = new StringBuilder("[");
        while(iterator1.hasNext()) {
            Object obj = iterator1.next();
            sb1.append(obj);
            if(!iterator1.hasNext()) {
                sb1.append("]");

            } else {
                sb1.append(",");
            }
        }
        System.out.println(sb1);

        iterator1 = c1.iterator();
        while(iterator1.hasNext()) {
            Object obj = iterator1.next();
            if(obj.equals("one")) {
                iterator1.remove();
            }
        }
        System.out.println("c1 = " + c1);


        System.out.println("**************************");
        for(Object obj : c1) {
            System.out.println(obj);
        }
    }
}
