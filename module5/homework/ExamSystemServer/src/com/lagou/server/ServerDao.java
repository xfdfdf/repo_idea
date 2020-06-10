package com.lagou.server;

import com.lagou.model.Student;
import com.lagou.model.User;

import javax.management.ObjectName;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 编程实现数据的存取
 */
public class ServerDao {

    /**
     * 编程实现管理员账号和密码的校验并将结果返回出去
     * @param user
     * @return
     */
    public boolean serverManagerCheck(User user) {
        if ("admin".equals(user.getUserName()) && "123456".equals(user.getPassword())) {
            return true;
        }
        return false;
    }

    /**
     * 编程实现学生账号和密码的校验并将结果返回出去
     * @param student
     * @return
     */
    public boolean serverStudentCheck(Student student) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
        List<Student> list = (ArrayList<Student>) ois.readObject();
        for(Student s : list) {
            if(student.getStudentNo().equals(s.getStudentNo()) && student.getPassword().equals(s.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
