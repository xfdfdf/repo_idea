package task11.package5;

//public class SubPerson extends Person { // 不保留泛型并且没有指定类型，此时Person类中的T默认为Object类型   擦除
//public class SubPerson extends Person<String> {  // 不保留泛型但指定了泛型的类型，此时Person类中的T被指定为String类型
//public class SubPerson<T> extends Person<T> { // 保留父类的泛型  可以在构造对象时来指定T的类型
public class SubPerson<T1, T> extends Person<T> { // 保留父类的泛型，同时在子类中增加新的泛型
    public void test(T1 t) {
        System.out.println(t + "hehe");
    }
}
