package task11.homework.work4.service;

import task11.homework.work4.entity.Student;

import java.util.List;


/**
 * 本接口是管理学生操作的接口设计
 */
public interface StudentService {
    //增加学生
    public void add(List<Student> list,Student student);
    //删除学生
    public void delete(List<Student> list,String studentNumber);
    //修改学生
    public void update(List<Student> list,Student student);
    //查找学生
    public void look(List<Student> list,String studentNumber);
    //遍历学生的信息
    public void lookAll(List<Student> list);
}
