package task11.package5;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        return 0;   //调用对象等于参数对象，调用对象就是新增加的对象
//        return -1;  //调用对象小于参数对象，后面加入的小于前面的，后面加入的在前面
//        return 1;   调用对象大于参数对象,后面加入的大于前面的，后面加入的在后面
        if(this.getAge() - o.getAge() != 0) {
            return this.getAge() - o.getAge() ;

        }
        return this.getName().compareTo(o.getName());
    }
}
