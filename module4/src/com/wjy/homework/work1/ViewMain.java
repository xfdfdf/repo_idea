package com.wjy.homework.work1;


import com.wjy.homework.work1.entity.Student;
import com.wjy.homework.work1.exception.AgeException;
import com.wjy.homework.work1.exception.StudentNumberException;
import com.wjy.homework.work1.service.StudentService;
import com.wjy.homework.work1.service.impl.StudentServiceImpl;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 显示主界面的类
 */
public class ViewMain {
    //定义一个list存储学生信息
    private static List<Student> list = null;
    private static StudentService studentService = null;
    private static ObjectInputStream ois = null;
    private static ObjectOutputStream oos = null;

    //添加学生的记录到list集合
    static {

            try {


                ois = new ObjectInputStream(new FileInputStream("D://a.txt"));
                list = (List<Student>) ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            }



    public static void Main() {
        studentService = (StudentService) new StudentServiceImpl();
        Scanner input = new Scanner(System.in);

        //定义学生的学号
        String studentNumber;
        //定义学生的姓名
        String name;
        //定义学生的年龄
        int age;
        //定义一个学生对象
        Student student;
        while (true) {
            System.out.println("******************************************************************");
            System.out.println("***  欢迎进入学生管理系统,请选择你需要的操作(输入对应的数字即可):  ***");
            System.out.println("***                    选择1,增加学生                           ***");
            System.out.println("***                    选择2,删除学生                           ***");
            System.out.println("***                    选择3,修改学生                           ***");
            System.out.println("***                    选择4,查找学生                           ***");
            System.out.println("***                    选择5,遍历全部的学生信息                  ***");
            System.out.println("***                    选择6,退出系统                           ***");
            System.out.println("******************************************************************");
            System.out.print("请输入对应的操作编号：");
            int i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.print("请输入学生的学号：");
                    studentNumber = input.next();
                    System.out.print("请输入学生的姓名：");
                    name = input.next();
                    System.out.print("请输入学生的年龄：");
                    age = input.nextInt();
                    try {
                        student = new Student(studentNumber, name, age);
                        studentService.add(list, student);
                    } catch (StudentNumberException e) {
                        e.printStackTrace();
                    } catch (AgeException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.print("请输入要删除的学生学号：");
                    studentNumber = input.next();
                    studentService.delete(list, studentNumber);
                    break;
                case 3:
                    System.out.print("请输入要修改的学生学号：");
                    studentNumber = input.next();
                    System.out.print("请输入要修改的学生姓名：");
                    name = input.next();
                    System.out.print("请输入要修改的学生年龄：");
                    age = input.nextInt();
                    try {
                        student = new Student(studentNumber, name, age);
                        studentService.update(list, student);
                    } catch (StudentNumberException e) {
                        e.printStackTrace();
                    } catch (AgeException e) {
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    System.out.print("请输入要查找的学生学号：");
                    studentNumber = input.next();
                    studentService.look(list,studentNumber);
                    break;
                case 5:
                    studentService.lookAll(list);
                    break;
                case 6:
                    try {
                        oos = new ObjectOutputStream(new FileOutputStream("D://a.txt"));

                        oos.writeObject(list);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            if(null != oos) {
                                oos.close();
                            }
                            if(null != ois) {
                                ois.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("退出本系统，欢迎下次的使用");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
