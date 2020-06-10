package package01;
import static java.lang.System.out;
public class Super {
    static{
        System.out.println("=======================Super的静态代码块");  //1
    }
    {
        System.out.println("===========================Super的构造块");
        out.println("as");
    }
    public Super() {
        System.out.println("Super的构造方法");
    }

}
