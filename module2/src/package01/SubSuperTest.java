package package01;

public class SubSuperTest extends Super {
    static {
        System.out.println("=================SubSuperTest的静态代码块");  //2
    }
    {
        System.out.println("================SubSuperTest的构造块"); //3
    }
    public SubSuperTest() {
        System.out.println("======================SubSuperTest的构造方法");
    }

    public static void main(String[] args) {
        SubSuperTest subSuperTest = new SubSuperTest();

    }
}
