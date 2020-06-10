package package01;

public class BlockTest extends FinalParent{
    //当需要在执行构造方法之前做一些准备工作的时候，则将准备工作相关的代码写在构造块中即可，比如：对于成员变量进行的统一的初始化操作
    {
        System.out.println("构造块！");
    }

    //静态代码块，随着类的加载而执行，和对象是否创建无关，静态代码块只执行一次，先于构造块执行。
    static{
        System.out.println("我是静态代码块");
    }
    //自定义构造方法
    public BlockTest() {
        System.out.println("=====构造方法体=====");
    }

    public static void main(String[] args) {
        BlockTest bt = new BlockTest();
        bt.gets();
    }

}

