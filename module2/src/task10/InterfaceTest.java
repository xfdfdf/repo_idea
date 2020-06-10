package task10;

public interface InterfaceTest {
    private void test() {
        System.out.println("hehe");
    }
    public  int num = 0;
    default void test1() {
        test();
        System.out.println("asd");
    }
    private void t() {

    }
    private static void ttt(){

    }
    static void test2() {

    }

    public static void main(String[] args) {
        int i = InterfaceTest.num;
        System.out.println(i);
    }
}
