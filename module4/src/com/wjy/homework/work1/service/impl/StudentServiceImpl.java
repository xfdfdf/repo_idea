package com.wjy.homework.work1.service.impl;



import com.wjy.homework.work1.entity.Student;
import com.wjy.homework.work1.service.StudentService;

import java.util.List;

/**
 * 本类用来实现学生接口的方法
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void add(List<Student> list, Student student) {
        for(Student s : list) {
            if(s.getStudentNumber().equals(student.getStudentNumber())) {
                System.out.println("学号已经存在，请重新输入");
                return;
            }
        }

        System.out.println("增加学生成功。");

        list.add(student);

    }

    @Override
    public void delete(List<Student> list,String studentNumber) {
        for(Student student : list) {
            if(student.getStudentNumber().equals(studentNumber)) {
                System.out.println("删除成功");
                list.remove(student);
                return;
            }
        }
        System.out.println("查无此人，删除失败");

    }

    @Override
    public void update(List<Student> list,Student student) {
        for(int i = 0;i < list.size();i++) {
            if(list.get(i).getStudentNumber().equals(student.getStudentNumber())) {
                System.out.println("修改成功");
                list.set(i,student);
                return;
            }
        }
        System.out.println("查无此人，修改失败");
    }

    @Override
    public void look(List<Student> list,String studentNumber) {
        for(Student student : list) {
            if(student.getStudentNumber().equals(studentNumber)) {
                System.out.println("该 " + studentNumber + "的学生信息如下 : " + student);
                return;
            }
        }
        System.out.println("本系统没有该学生，请重新输入");
    }

    @Override
    public void lookAll(List<Student> list) {
        for(Student student : list) {
            System.out.println(student);
        }

    }
}
