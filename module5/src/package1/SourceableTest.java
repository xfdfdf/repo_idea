package package1;

public class SourceableTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        sourceable.method();

        System.out.println("*********************");
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
        System.out.println("*********************");

        Sourceable sourceable2 = new Decorator(sourceable1);
        sourceable2.method();
        System.out.println("*******************");
        Sourceable sourceable3 = new Proxy();
        sourceable3.method();
    }
}
