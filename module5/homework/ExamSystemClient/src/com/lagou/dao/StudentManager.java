package com.lagou.dao;

import com.lagou.model.Student;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * 管理员管理学生的操作
 */
public interface StudentManager {
    //增加学生
    public void insert() throws IOException, ClassNotFoundException;
    //更新学生的消息
    public void update() throws IOException, ClassNotFoundException;
    //删除学生
    public void delete() throws IOException, ClassNotFoundException;
    //查找学生
    public Student seek() throws IOException, ClassNotFoundException;

}
