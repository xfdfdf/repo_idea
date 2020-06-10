package task11.package1;

public class BooleanTest {
    public static void main(String[] args) {
        Boolean bo1 = Boolean.valueOf(true);
        Boolean bo2 = Boolean.valueOf("fals1e");
        System.out.println("bo1 = " + bo1);
        System.out.println("bo2 = " + bo2);
        bo2 = Boolean.parseBoolean("true"); //参数不是true，返回false,看源码和手册
        System.out.println("bo2 = " + bo2);
        System.out.println("----------------------------");

    }
}
