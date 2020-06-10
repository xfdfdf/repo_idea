package task11.package5;

public class PersonTest {
    public static void main(String[] args) {
        //1.如果不指定泛型，那么就是默认Object
        Person p = new Person();
        p.setName("hhh");
        p.setGender("hehe");
        System.out.println(p);

        //2.加了泛型，就按照泛型指定的
        Person<Boolean> p1= new Person();
        p1.setGender(false);
        System.out.println(p1);
        p1.printArray(new Integer[]{11,22,33,44});
    }
}
