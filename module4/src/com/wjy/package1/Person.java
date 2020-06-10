package com.wjy.package1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public Person() {
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
        if(age > 0 && age < 150) {
            this.age = age;

        } else {
            try {
                throw new AgeException("年龄不合理");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }
}
