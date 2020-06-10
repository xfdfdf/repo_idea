import task10.MyAnnotation;

@MyAnnotation(value = "heheh")
public class Person {
    @MyAnnotation(value="ss")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**、
     * name:描述姓名
     */
    private String name;
    /**
     * age:表示年龄
     */
    private int age;

    /**
     *
     * @return  返回年龄
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
