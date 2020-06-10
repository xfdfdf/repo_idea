package package01;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("主方法之中参数的个数：" + args.length);
        System.out.print("主方法之中参数的值：" );
        for(String str : args) {
            System.out.println(str);
        }
    }
}
