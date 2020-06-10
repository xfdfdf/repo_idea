package com.lagou.dao.impl;

import com.lagou.client.ClientScanner;
import com.lagou.dao.StudentManager;
import com.lagou.model.Student;

import java.io.*;
import java.util.List;

public class StudentManagerImpl implements StudentManager {

    public StudentManagerImpl() throws IOException {

    }

    @Override
    public void insert() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("请输入学生的姓名：");
            String username = ClientScanner.getScanner().next();
            System.out.println("请输入学生的学号：");
            String studentNo = ClientScanner.getScanner().next();
            System.out.println("请输入学生的密码：");
            String password = ClientScanner.getScanner().next();
            boolean isFlag = false;
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

            List<Student> list = (List<Student>) ois.readObject();
            for (Student s : list) {
                if (s.getStudentNo().equals(studentNo)) {
                    System.out.println("学号已经存在，请重新输入：");
                    isFlag = true;
                    break;
                }
            }
            if(true != isFlag) {
                Student s = new Student(studentNo,username,password);
                list.add(s);
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

                oos.writeObject(list);
                System.out.println("增加学生信息成功！");
                return;
            }

        }
    }

    @Override
    public void update() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

        List<Student> list = (List<Student>) ois.readObject();
        while (true) {
            System.out.print("请输入要更新的学生的学号：");
            String studentNo = ClientScanner.getScanner().next();
            boolean isFlag = false;
            for (Student s : list) {
                if (s.getStudentNo().equals(studentNo)) {
                    System.out.println("请输入学生的姓名：");
                    String username = ClientScanner.getScanner().next();
                    System.out.println("请输入学生的密码：");
                    String password = ClientScanner.getScanner().next();
                    s.setPassword(password);
                    s.setUsername(username);
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

                    oos.writeObject(list);
                    System.out.println("更新学员信息成功");
                    isFlag = true;
                    return;
                }
            }
            if (isFlag == false) {
                System.out.println("学号不存在，请重新输入：");
            }
        }
    }
    @Override
    public void delete() throws IOException, ClassNotFoundException {
        List<Student> list ;
        while (true) {
            System.out.print("请输入要删除的学生的学号：");
            String studentNo = ClientScanner.getScanner().next();
            boolean isFlag = false;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

            list = (List<Student>) ois.readObject();
            for(int i = 0;i < list.size();i++) {
                if(list.get(i).getStudentNo().equals(studentNo)) {
                    list.remove(i);
                    isFlag = true;
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

                    oos.writeObject(list);

                    System.out.println("删除学生信息成功！");
                    return;
                }
            }
            if (isFlag == false) {
                System.out.println("学号不存在，请重新输入：");
            }
        }
    }

    @Override
    public Student seek() throws IOException, ClassNotFoundException{
        List<Student> list ;
        while (true) {
            System.out.print("请输入要查找的学生的学号：");
            String studentNo = ClientScanner.getScanner().next();
            boolean isFlag = false;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));

            list = (List<Student>) ois.readObject();
            for(int i = 0;i < list.size();i++) {
                if(list.get(i).getStudentNo().equals(studentNo)) {
                    System.out.println(list.get(i));
                    isFlag = true;
                    return list.get(i);
                }
            }
            if (isFlag == false) {
                System.out.println("学号不存在，请重新输入：");
            }
        }
    }
}
