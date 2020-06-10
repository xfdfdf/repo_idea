package task11.package4;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " +s1);

        System.out.println("****************************");
        for(int i = 1;i < 6;i++) {
            Object obj = s1.push(i * 11);
            System.out.println("栈中的元素有：" + s1);
        }
        System.out.println("*********************");
        Object obj2 = s1.peek();
        System.out.println("获取到的栈顶的元素是：" + obj2);

        for(int i = 0;i < s1.size();) {
            Object obj = s1.pop();
            s2.push(obj);
            System.out.println("出栈的元素是：" + obj);
        }
        System.out.println(s2);
        for(int i = 0;i < s2.size();) {
            Object obj = s2.pop();

            System.out.println("出栈的元素是：" + obj);
        }
    }
}
