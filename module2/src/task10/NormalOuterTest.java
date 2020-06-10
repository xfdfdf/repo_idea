package task10;

public class NormalOuterTest {
    public static void main(String[] args) {
        NormalOuter outer = new NormalOuter();
        NormalOuter.NormalInner inner = outer.new NormalInner();
        inner.show();
        inner.show2(11);
    }
}
