package task10;

import org.junit.Test;

public class StaticOutTest {
    public static void main(String[] args) {
        StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
        inner.show();
        System.out.println("******************");
        inner.show1(22);
    }
    @Test
    public void test() {
        NormalOuter outer = new NormalOuter();
        NormalOuter.NormalInner inner = outer.new NormalInner();
        inner.show();

    }
}
