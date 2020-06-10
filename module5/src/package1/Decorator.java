package package1;



public class Decorator implements Sourceable {
    private Sourceable sourceable;
    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        sourceable.method();
        System.out.println("化妆后的你更加美");
    }
}
