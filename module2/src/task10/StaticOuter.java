package task10;

/**
 * 实现静态内部类的定义和使用
 */
public class StaticOuter {
    private int cnt = 1;        //隶属于对象层级
    private static int snt = 2;//隶属于类层级
    public void show() {
        System.out.println("这是外部类的非静态方法！");
    }
    public static void show1() {
        System.out.println("这是外部类的静态方法！");
    }

    /**
     * 定义静态内部类  有static修饰，隶属于类层级
     */

    public static class StaticInner {
        private int ia = 3;
        private static int snt = 888888;
        public StaticInner() {
            System.out.println("静态内部类的构造方法哦");
        }

        public void show() {
            System.out.println("ia = " + ia);
            System.out.println("外部类中的snt = " + snt);
            //System.out.println("外部类的cnt = " + cnt);静态内部类不能访问非静态属性，可能此时还没有对象
            new StaticOuter().show();
        }

        public void show1(int cnt) {
            System.out.println("方法中的cnt = " + cnt);
            System.out.println("内部类中的snt = " + this.snt);
            System.out.println("外部类中的snt = " + StaticOuter.snt);
            //System.out.println("外部类的cnt = " + cnt);静态内部类不能访问非静态属性，可能此时还没有对象
            StaticOuter.show1();
        }
    }
}
