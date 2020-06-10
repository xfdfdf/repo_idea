package package1;

public class SendFactory {
    //自定义成员方法实现对象的创建
    public Sender produce(String type){
            if("sms".equals(type)) {
                return new SmsSender();
            } else if("mail".equals(type)) {
                return new MailSender();
            } else {
                System.out.println("没有这个类型，请重新输入（sms、mail）");
                return null;
            }
    }

    public static Sender produceMail() {
        return new MailSender();
    }
    public static Sender produceSms() {
        return new SmsSender();
    }
}
