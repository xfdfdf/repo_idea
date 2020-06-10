package task11.package4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {


       //1.准备一个Queue集合并且打印
        Queue queue = new LinkedList();
        System.out.println("队列中 的元素有：" + queue);
        System.out.println("******************");
        for(int i = 1;i < 6;i++) {
            boolean b1 = queue.offer(i * 11);
            System.out.println("b1 = " + b1);
            System.out.println("队列中的元素有：" + queue);
        }

        Object obj = queue.peek();
        System.out.println("队首元素是：" + obj);
        for(int i = 0;i < queue.size();) {
            System.out.println("出队列的元素是：" + queue.poll());
        }
        System.out.println(queue);


    }
}
