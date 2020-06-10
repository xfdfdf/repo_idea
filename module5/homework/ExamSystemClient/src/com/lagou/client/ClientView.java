package com.lagou.client;

import com.lagou.dao.QuestionManager;
import com.lagou.dao.StudentManager;
import com.lagou.dao.impl.QuestionManagerImpl;
import com.lagou.dao.impl.StudentManagerImpl;
import com.lagou.model.Student;
import com.lagou.model.User;
import com.lagou.model.UserMessage;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.*;

/**
 * 编程实现客户端的主界面绘制和相应功能的实现
 */
public class ClientView {
    /**
     * 定义一个StudentManagerImpl类，实现管理员对于学生信息的增删改查
     */
    StudentManager studentManagerDao;

    /**
     * 定义一个QuestionManagerImpl类来实现考题的管理
     */

    QuestionManager questionManager;

    /**
     * 考试试卷所在的文件
     */
    private File[] files;
    /**
     * 为了可以使用输入输出流，采用合成复用原则实现
     */
    private ClientInitClose cic;

    /**
     * 通过构造方法实现成员变量的初始化
     *
     * @param cic
     */
    public ClientView(ClientInitClose cic) {
        this.cic = cic;
    }

    /**
     * 自定义成员方法实现客户端主界面的绘制
     */
    public void clientMainPage() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("  \n\n\t\t   在线考试系统");
            System.out.println("-------------------------------------------");
            System.out.print("   [1] 学员系统");
            System.out.println("     [2] 管理员系统");
            System.out.println("   [0] 退出系统");
            System.out.println("-------------------------------------------");
            System.out.println("请选择要进行的业务编号：");
            //Scanner sc = new Scanner(System.in);
            //int choose = sc.nextInt();
            int choose = ClientScanner.getScanner().nextInt();
            switch (choose) {
                case 1:
                    clientStudentLogin();
                    break;
                case 2:
                    clientManagerLogin();
                    break;
                case 0:
                    System.out.println("正在退出系统...");
                    return;
                default:
                    System.out.println("输入错误，请重新选择！");
            }
        }
    }

    /**
     * 自定义成员方法实现客户端管理员登录的功能
     */
    private void clientManagerLogin() throws IOException, ClassNotFoundException {
        // 1.准备管理员登录的相关数据
        System.out.println("请输入管理员的账户信息：");
        String userName = ClientScanner.getScanner().next();
        System.out.println("请输入管理员的密码信息：");
        String password = ClientScanner.getScanner().next();
        UserMessage tum = new UserMessage("managerCheck", new User(userName, password));
        // 2.将UserMessage类型的对象通过对象输出流发送给服务器
        cic.getOos().writeObject(tum);
        System.out.println("客户端发送管理员账户信息成功！");
        // 3.接收服务器的处理结果并给出提示
        tum = (UserMessage) cic.getOis().readObject();
        if ("success".equals(tum.getType())) {
            System.out.println("登录成功，欢迎使用管理员系统！");
            System.out.println("  [1] 学员管理模块");
            System.out.println("  [2] 考试管理模块");
            System.out.println("  [3] 退出管理员系统");
            int choose = ClientScanner.getScanner().nextInt();
            while (true) {
                switch (choose) {
                    case 1:
                        studentManagerDao = new StudentManagerImpl();
                        while (true) {
                            System.out.println("欢迎进入学员管理模块：下面是对应的操作：");
                            System.out.println(" [1] 添加学员");
                            System.out.println(" [2] 修改学员");
                            System.out.println(" [3] 删除学员");
                            System.out.println(" [4] 查询学员");
                            System.out.println(" [5] 退出系统");
                            choose = ClientScanner.getScanner().nextInt();
                            switch (choose) {
                                case 1:
                                    studentManagerDao.insert();
                                    break;
                                case 2:
                                    studentManagerDao.update();
                                    break;
                                case 3:
                                    studentManagerDao.delete();
                                    break;

                                case 4:
                                    studentManagerDao.seek();
                                    break;
                                case 5:
                                    return;

                                default:
                                    System.out.println("输入错误，请重新输入！");
                                    break;
                            }
                        }
                    case 2:
                        questionManager = new QuestionManagerImpl();
                        while (true) {
                            System.out.println("欢迎进入考试管理模块：下面是对应的操作：");
                            System.out.println(" [1] 增加考题");
                            System.out.println(" [2] 修改考题");
                            System.out.println(" [3] 删除考题");
                            System.out.println(" [4] 查询考题");
                            System.out.println(" [5] 导入考题");
                            System.out.println(" [6] 批改试卷");
                            System.out.println(" [7] 退出系统");
                            choose = ClientScanner.getScanner().nextInt();
                            switch (choose) {
                                case 1:
                                    questionManager.insert();
                                    break;
                                case 2:
                                    questionManager.update();
                                    break;
                                case 3:
                                    questionManager.delete();
                                    break;
                                case 4:
                                    questionManager.seek();
                                    break;
                                case 5:
                                    questionManager.importQuestion();
                                    break;
                                case 6:
                                    questionManager.judgeQuestion();
                                    break;
                                case 7:
                                    return;

                                default:
                                    System.out.println("输入错误，请重新输入！");
                                    break;
                            }
                        }

                }
            }
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    /**
     * 自定义成员方法实现客户端学生登录的功能
     */
    private void clientStudentLogin() throws IOException, ClassNotFoundException {
        System.out.println("正在进入学员系统...");
        System.out.println("请输入学号：");
        String studentNo = ClientScanner.getScanner().next();
        System.out.println("请输入密码：");
        String password = ClientScanner.getScanner().next();
        Student student = new Student(studentNo, password);
        cic.getOos().writeObject(student);
        System.out.println("客户端发送学生账户信息成功！");
        // 3.接收服务器的处理结果并给出提示
        student = (Student) cic.getOis().readObject();
        if ("success".equals(student.getType())) {
            while (true) {
                System.out.println("登录成功，欢迎使用学生系统！");
                System.out.println(" [1]  用户模块");
                System.out.println(" [2]  考试模块");
                System.out.println(" [3]   退出学生系统");
                System.out.print("请输入对应的操作：");
                int choose = ClientScanner.getScanner().nextInt();

                loop:
                switch (choose) {
                    case 1:
                        System.out.println("***********************************");
                        System.out.println("  [1] 修改密码");
                        System.out.println("  [2] 退出");
                        System.out.print("欢迎进入用户模块，请选择对应的操作：");
                        choose = ClientScanner.getScanner().nextInt();
                        switch (choose) {
                            case 1:
                                System.out.println("请输入新的密码：");
                                String newPassword = ClientScanner.getScanner().next();
                                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                                List<Student> list = (List<Student>) ois.readObject();
                                for (Student s : list) {
                                    if (s.getStudentNo().equals(student.getStudentNo()) && s.getPassword().equals(student.getPassword())) {
                                        s.setPassword(newPassword);
                                    }
                                }
                                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                                oos.writeObject(list);
                                System.out.println("修改密码成功");
                                break;
                            case 2:
                                System.out.println("退出用户模块！");
                                break loop;
                            default:
                                System.out.println("输入错误，请重新输入！");
                                break;

                        }
                        break;
                    //考试模块
                    case 2:
                        System.out.println("***********************************");
                        System.out.println("  [1] 开始考试");
                        System.out.println("  [2] 导出成绩");
                        System.out.println("  [3] 查询成绩");
                        System.out.print("欢迎进入考试模块，请选择对应的操作：");
                        choose = ClientScanner.getScanner().nextInt();
                        switch (choose) {
                            case 1:
                                System.out.println("请选择考试的科目: ");
                                files = new File("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷").listFiles();
                                System.out.println("**************************************");
                                for (File f : files) {
                                    String[] strs = f.getName().split("\\.");
                                    System.out.println(strs[0]);
                                }
                                System.out.println("**************************************");

                                System.out.println("请输入要考试的考试科目: ");

                                String object = ClientScanner.getScanner().next();
                                boolean isFlag = false;

                                for (File f : files) {
                                    if ((object + ".txt").equals(f.getName())) {
                                        isFlag = true;
                                        Date d = new Date();
                                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\考试试卷\\" + (object + ".txt")));
                                        HashMap<Integer, String> map = (HashMap<Integer, String>) ois.readObject();
                                        System.out.println(object + "试卷内容是：");
                                        Set<Integer> integers = map.keySet();
                                        for (Integer i : integers) {
                                            System.out.println(i + ". " + map.get(i));
                                        }
                                        HashMap<Integer, String> answer = new HashMap();
                                        for (Integer i : integers) {
                                            System.out.println("请输入第 " + i + " 题的答案： ");
                                            String answerQuestion = ClientScanner.getScanner().next();
                                            map.put(i, map.get(i) + "\n \"答案是 ；" + answerQuestion);
                                        }
                                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\已提交的考试试卷\\" + (studentNo + "的" + object + "答卷.txt")));
                                        oos.writeObject(map);
                                        System.out.println("考试结束，试卷提交成功，由管理员进行批改！请稍后！");
                                    }
                                }

                                if (isFlag != true) {
                                    System.out.println("没有该科目，请重新输入！");
                                }
                                break;
                            case 2:
                                System.out.println("请输入你要导出成绩的文件路径：");
                                String filePath = ClientScanner.getScanner().next();
                                File fp = new File(filePath + "\\" + studentNo + "的成绩集合.txt");
                                if (!fp.exists()) {
                                    fp.createNewFile();
                                }
                                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                                List<Student> list = (List<Student>) ois.readObject();
                                for(Student s : list) {
                                    if(s.getStudentNo().equals(studentNo)) {
                                        Map<String, Integer> map = s.getGradeMap();
                                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fp));
                                        oos.writeObject(map);
                                    }
                                }



                                System.out.println("导出成绩成功");
                                break;
                            case 3:
                                new File("javase项目文件集合");
                                ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("D:\\拉勾网Java基础班资料\\javase项目文件集合\\studentlist.txt"));
                                List<Student> list1 = (List<Student>) ois1.readObject();
                                for(Student s : list1) {
                                    if(s.getStudentNo().equals(studentNo)) {
                                        Map<String, Integer> map1 = s.getGradeMap();
                                        System.out.println("你的成绩信息是：" + map1);
                                    }
                                }

                                break;
                            default:
                                System.out.println("输入错误，请重新输入！");
                                break;

                        }
                        break;

                    case 3:
                        System.out.println("退出学生系统成功！");
                        return;
                    default:
                        System.out.println("输入错误，请重新输入");
                        break;
                }
            }


        } else {
            System.out.println("用户名或密码错误！");
        }
    }
}
