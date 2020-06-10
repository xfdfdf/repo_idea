package com.lagou.dao.impl;

import com.lagou.client.ClientScanner;
import com.lagou.dao.QuestionManager;
import com.lagou.dao.StudentManager;
import com.lagou.model.Student;

import java.io.*;
import java.util.*;

public class QuestionManagerImpl implements QuestionManager {
    @Override
    public void insert() throws IOException, ClassNotFoundException {
        System.out.println("下面是已经存在的试卷: ");
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
        System.out.println("**************************************");
        for (File f : files) {
            String[] strs = f.getName().split("\\.");
            System.out.println(strs[0]);
        }
        System.out.print("请输入要增加题目的试卷：");
        String object = ClientScanner.getScanner().next();
        boolean isFlag = false;

        for (File f : files) {
            if ((object + ".txt").equals(f.getName())) {
                isFlag = true;
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
                System.out.println(object + "试卷内容是：");
                Set<Integer> integers = map.keySet();
                for (Integer i : integers) {
                    System.out.println(i + ". " + map.get(i));
                }
                System.out.println("请输入增加考题的序号：");
                Integer number = ClientScanner.getScanner().nextInt();
                System.out.println("请输入增加考题的内容：");
                ClientScanner.getScanner().nextLine();
                String content = ClientScanner.getScanner().nextLine();
                map.put(number,content);
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                oos.writeObject(map);
                System.out.println("增加考题成功");

            }
        }

        if (isFlag != true) {
            System.out.println("没有该科目，请重新输入！");
        }
    }

    @Override
    public void update() throws IOException, ClassNotFoundException {
        System.out.println("下面是已经存在的试卷: ");
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
        System.out.println("**************************************");
        for (File f : files) {
            String[] strs = f.getName().split("\\.");
            System.out.println(strs[0]);
        }
        System.out.print("请输入要修改题目的试卷：");
        String object = ClientScanner.getScanner().next();
        boolean isFlag = false;

        for (File f : files) {
            if ((object + ".txt").equals(f.getName())) {
                isFlag = true;
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
                System.out.print("请输入修改考题的序号：");
                Integer number = ClientScanner.getScanner().nextInt();
                Set<Integer> integers = map.keySet();

                for (Integer i : integers) {
                    if(i.equals(number)) {
                        System.out.print("请输入修改考题的内容：");
                        ClientScanner.getScanner().nextLine();
                        String content = ClientScanner.getScanner().nextLine();
                        map.put(number,content);
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                        oos.writeObject(map);
                        System.out.println("修改考题成功");
                        return;
                    }
                }
                System.out.println("序号不存在，请重新输入！");



            }
        }

        if (isFlag != true) {
            System.out.println("没有该科目，请重新输入！");
        }
    }

    @Override
    public void delete() throws IOException, ClassNotFoundException {
        System.out.println("下面是已经存在的试卷: ");
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
        System.out.println("**************************************");
        for (File f : files) {
            String[] strs = f.getName().split("\\.");
            System.out.println(strs[0]);
        }
        System.out.print("请输入要删除题目的试卷：");
        String object = ClientScanner.getScanner().next();
        boolean isFlag = false;

        for (File f : files) {
            if ((object + ".txt").equals(f.getName())) {
                isFlag = true;
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
                System.out.print("请输入删除考题的序号：");
                Integer number = ClientScanner.getScanner().nextInt();
                Set<Integer> integers = map.keySet();
                for (Integer i : integers) {
                    if(i.equals(number)) {
                        map.remove(i);
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                        oos.writeObject(map);
                        System.out.println("刪除考题成功");
                        return;
                    }
                }
                System.out.println("序号不存在，请重新输入！");



            }
        }

        if (isFlag != true) {
            System.out.println("没有该科目，请重新输入！");
        }
    }

    @Override
    public void seek() throws IOException, ClassNotFoundException {
        System.out.println("下面是已经存在的试卷: ");
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
        System.out.println("**************************************");
        for (File f : files) {
            String[] strs = f.getName().split("\\.");
            System.out.println(strs[0]);
        }
        System.out.print("请输入要查找题目的试卷：");
        String object = ClientScanner.getScanner().next();
        boolean isFlag = false;

        for (File f : files) {
            if ((object + ".txt").equals(f.getName())) {
                isFlag = true;
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
                System.out.println(object + "试卷内容是：");
                System.out.print("请输入查找考题的序号：");
                Integer number = ClientScanner.getScanner().nextInt();
                Set<Integer> integers = map.keySet();
                for (Integer i : integers) {
                    if(i.equals(number)) {

                        System.out.println("查找考题成功，考题内容是：" + map.get(i));
                        return;
                    }
                }
                System.out.println("序号不存在，请重新输入！");



            }
        }

        if (isFlag != true) {
            System.out.println("没有该科目，请重新输入！");
        }

    }

    @Override
    public void importQuestion() throws IOException, ClassNotFoundException {
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\待上传的考试试卷").listFiles();
        System.out.println("以下是全部的待上传的试卷文件：");
        System.out.println("*************************************");
        for(File f : files) {
            System.out.println(f.getName());
        }
        System.out.println("*************************************");
        System.out.print("请输入你要导入的试卷名称：");
        ClientScanner.getScanner().nextLine();
        String examName = ClientScanner.getScanner().nextLine();
        for(File f : files) {
            if(f.getName().equals(examName)) {
                FileInputStream fis = new FileInputStream(f.getAbsoluteFile());
                FileOutputStream fos = new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + examName);
                byte[] b = new byte[1024];
                int length = -1;
                while((length = fis.read(b)) != -1) {
                    fos.write(b,0,length);
                }
                System.out.println(examName + "试卷上传成功！");
                break;
            }
        }

    }

    @Override
    public void judgeQuestion() throws IOException, ClassNotFoundException {
        File[] files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\已提交的考试试卷").listFiles();
        System.out.println("提交试卷的试卷信息如下：");
        System.out.println("************************************");
        for(File f : files) {
            System.out.println(f.getName());
        }
        boolean isFlag = true;
        System.out.println("************************************");
        System.out.print("请输入你要批改的试卷：");
        ClientScanner.getScanner().nextLine();
        String examPaper = ClientScanner.getScanner().nextLine();
        System.out.println("examPaper = " + examPaper);
        for(File f : files) {
            if(f.getName().equals(examPaper)) {
                isFlag = false;
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\已提交的考试试卷\\" + examPaper));
                Map<Integer,String> map = (Map<Integer, String>) ois.readObject();
                Set<Integer> integers = map.keySet();
                for(Integer i : integers) {
                    System.out.println(i + " . " + map.get(i));
                }
                System.out.print("请输入该试卷的成绩：");
                int score = ClientScanner.getScanner().nextInt();
                String[] strs = examPaper.split("的");
                System.out.println("str[0]  " + strs[0]);
                String str1 = strs[1].replaceAll("答卷.txt","");
                System.out.println("str1 " + str1);
                Map<String,Integer> map1 = new HashMap<>();

                ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                List<Student> list = (List<Student>) ois.readObject();
                for(int i = 0;i < list.size();i++){
                    if(list.get(i).getStudentNo().equals(strs[0])) {
                        if(list.get(i).getGradeMap() !=null) {
                            map1 = list.get(i).getGradeMap();

                        }
                        map1.put(str1,score);
                        list.get(i).setGradeMap(map1);
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                        oos.writeObject(list);
                        System.out.println("批改成功");
                    }
                }

            }
        }
        if(isFlag) {
            System.out.println("不存在该文件，请重新输入！");
        }
    }
}
