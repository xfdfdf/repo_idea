package task10;

/**
 * 编程实现局部内部类的定义和使用
 */
public class AreaOuter {
    private int cnt = 1;


    public void show() {
        //定义一个局部变量进行测试，从Java8开始默认理解为final关键字修饰的变量
        final int ic = 5;
        //定义的局部内部类，只可以在方法体内使用
        class AreaInner {
            int ia = 2;

            public AreaInner() {
                System.out.println("局部内部类的构造方法！");
            }

            public void test() {
                System.out.println("ia = " + ia);
                System.out.println("cnt = " + cnt);
                System.out.println("ic= " + ic);

            }
        }

        //声明局部内部类的引用指向局部内部类的对象
        AreaInner ai = new AreaInner();
        ai.test();

    }
}
