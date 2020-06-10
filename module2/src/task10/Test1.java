package task10;

import org.junit.Test;

public class Test1 {
    public void show(String...args) {
        for(int i = 0; i < args.length;i++) {
            System.out.println("我是第 " + (i + 1) + "个参数，我的值是 " + args[i]);
        }
        System.out.println("***************************");
    }

    public void show(String str, int... args) {
        for(int i = 0; i < args.length;i++) {
            System.out.println("我是第 " + (i + 1) + "个参数，我的值是 " + args[i]);
        }
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();


        test1.show("1","2");
        test1.show("1","2","3");
        test1.show("1",1,2,3,4,22,22,4,3);
    }
    @Test
    public void test() {
        System.out.println((int)'a');
        System.out.println((int)'0');
    }
}
