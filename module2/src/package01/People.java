package package01;

import org.junit.Test;

public class People {
    private String name;
    private int age;
    public void show() {
        System.out.println("name = " + name + ",age = " + age);

    }
    public People() {

        System.out.println("People()");
    }
    public People(String name,Integer age) {
        setAge(age);
        setName(name);
        System.out.println("People(Strign name,int age)");
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


    public static void main(String[] args) {


        People p = new People("hehe",12);
        p.show();
    }

}
