package package1;

import org.junit.Test;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){

    }

    public static Singleton getSingleton() {
        if(null == singleton) {
            synchronized(Singleton.class) {
                if(null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.class);
        System.out.println(Singleton.getSingleton().getClass());
    }
}
