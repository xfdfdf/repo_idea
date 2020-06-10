package com.wjy.homework.work1.entity;

import com.wjy.homework.work1.exception.AgeException;
import com.wjy.homework.work1.exception.StudentNumberException;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {


    private static final long serialVersionUID = 6602936686781836486L;
    //学号
    private String studentNumber;
    //姓名
    private String name;
    //年龄
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNumber, student.studentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNumber);
    }

    public Student(String studentNumber, String name, int age) throws StudentNumberException, AgeException {
        setStudentNumber(studentNumber);
        setAge(age);
        this.name = name;
    }

    public Student() {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) throws StudentNumberException {
        if(studentNumber.length() != 8 || !studentNumber.startsWith("s")) {
            throw new StudentNumberException("学号必须是八位以s开头，后七位是数字的格式");
        } else {
            this.studentNumber = studentNumber;

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
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

    public void setAge(int age) throws AgeException {
        if(age < 0 || age > 150) {
            throw new AgeException("年龄必须在0-150之间");
        } else {
            this.age = age;

        }
    }
}
