package package01;

public class Singleton {
    private Singleton() {

    }
    //private static Singleton singleton = new Singleton();   //饿汉式,推荐
    private static Singleton singleton = null;   //懒汉式

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return  singleton;
    }
}
