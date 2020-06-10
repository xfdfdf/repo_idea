package com.lagou.model;

import java.io.Serializable;
import java.util.Map;

public class Student implements Serializable {
    private static final long serialVersionUID = 4462502010776815527L;
    private String studentNo;    //学生的学号
    private String username;   //学生姓名
    private String password;   //学生的密码
    private String type;       //学生登录返回的状态
    private Map<String,Integer> gradeMap;  //记录考生的课程成绩


    public Map<String, Integer> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<String, Integer> gradeMap) {
        this.gradeMap = gradeMap;
    }


    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gradeMap=" + gradeMap +
                '}';
    }

    public Student(String studentNo, String username, String password) {
        this.studentNo = studentNo;
        this.username = username;
        this.password = password;
    }

    public Student() {
    }

    public Student(String studentNo, String password) {
        this.studentNo = studentNo;
        this.password = password;
    }
}
