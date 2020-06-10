package package1;

public class Proxy implements Sourceable{
    private Source source;
    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        source.method();
        System.out.println("我和装饰器模式不一样");
    }


}
