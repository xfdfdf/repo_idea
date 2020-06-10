package com.lagou.server;

import com.lagou.model.Student;
import com.lagou.model.UserMessage;

import java.io.IOException;

/**
 * 编程实现服务器的主功能
 */
public class ServerView {

    /**
     * 使用合成复用原则
     */
    private ServerInitClose sic;
    private ServerDao sd;

    /**
     * 通过构造方法实现成员变量的初始化
     * @param sic
     */
    public ServerView(ServerInitClose sic, ServerDao sd) {
        this.sic = sic;
        this.sd = sd;
    }

    /**
     * 自定义成员方法实现客户端发来消息的接收并处理
     */
    public void serverReceive() throws IOException, ClassNotFoundException {

        Object obj = sic.getOis().readObject();
        if(obj instanceof UserMessage) {
        UserMessage tum = (UserMessage) obj;

        System.out.println("接收到的消息是：" + tum);
        // 调用方法实现管理员账号和密码信息的校验
        if (sd.serverManagerCheck(tum.getUser())) {
            tum.setType("success");
        } else {
            tum.setType("fail");
        }
        // 将校验结果发送给客户端
        sic.getOos().writeObject(tum);
            sic.getOos().flush();
            System.out.println("服务器发送校验结果成功！");
    } else if(obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("接收到的消息是：" + student);
            if(sd.serverStudentCheck(student)) {
                student.setType("success");
            } else {
                student.setType("fail");

            }
            // 将校验结果发送给客户端
            sic.getOos().writeObject(student);
            sic.getOos().flush();
            System.out.println("服务器发送校验结果成功！");

        }
    }
}
