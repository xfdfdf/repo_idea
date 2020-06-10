package task10;

public class NormalOuter {
    private int cnt = 1;

    final class NormalInner {
        private int ia = 99;
        private int cnt = 111199;
        public void show() {
            System.out.println("外部类中变量cnt的数值是：" + cnt);
            System.out.println("ia = ：" + ia);
        }
        public void show2(int cnt) {
            System.out.println("方法的局部变量是 " + cnt);
            System.out.println("内部类的cnt值：" + this.cnt);
            System.out.println("外部类的cnt值：" + NormalOuter.this.cnt);
        }
    }
}
