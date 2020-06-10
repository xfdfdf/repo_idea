package com.wjy.homework.work1;

import com.wjy.homework.work1.entity.Student;
import com.wjy.homework.work1.exception.AgeException;
import com.wjy.homework.work1.exception.StudentNumberException;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理员使用界面
 */
public class StudentManage {
//    定义一个视图对象
    private static ViewMain viewMain;
    public static void main(String[] args) {

//        初始化视图对象
        viewMain = new ViewMain();
//        调用主界面的方法
        viewMain.Main();
    }


}

