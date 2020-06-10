package package1;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
