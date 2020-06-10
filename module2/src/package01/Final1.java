package package01;

public class Final1 extends FinalTest {

    public final int sum;

    {
        sum = 0;
    }
    public void test() {
        super.test();
    }

    public static void main(String[] args) {
        Final1 f = new Final1();
        f.test();
    }
}
