package task10;

public class AnonymousInterfaceTest {

    public static void test(AnonymousInterface ai) {
        ai.show();
    }

    public static void main(String[] args) {
        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());

        AnonymousInterface ai = new AnonymousInterface(){
            @Override
            public void show() {
                System.out.println("helloworld");
            }


        };
        AnonymousInterfaceTest.test(ai);
        AnonymousInterfaceTest.test(new AnonymousInterface() {

            @Override
            public void show() {
                System.out.println("asd");
            }
        });

        AnonymousInterface ai1 = ()-> System.out.println("lamaba表达式原来如此简单");
        AnonymousInterfaceTest.test(ai1);

    }
}
