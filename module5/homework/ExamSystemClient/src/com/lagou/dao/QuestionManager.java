package com.lagou.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface QuestionManager {
    //增加考题
    public void insert() throws IOException, ClassNotFoundException;
    //修改考题
    public void update() throws IOException, ClassNotFoundException;
    //删除考题
    public void delete() throws IOException, ClassNotFoundException;
    //查找考题
    public void seek() throws IOException, ClassNotFoundException;
    //导入考题
    public void importQuestion() throws IOException, ClassNotFoundException;
    //批改考题
    public void judgeQuestion() throws IOException, ClassNotFoundException;
}
