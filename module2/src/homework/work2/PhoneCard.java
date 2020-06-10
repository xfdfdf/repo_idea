package homework.work2;

/**
 * 手机卡类
 */
public class PhoneCard {
    //卡的类型
    private PhoneCardEnum phoneCardEnum;
    //卡号
    private String cardNumber;
    //用户名
    private String username;
    //密码
    private String password;
    //账户余额
    private double balance;
    //通话时长（分钟）
    private int commTime;
    //上网流量
    private double onlineFlow;
    //显示信息的方法
    public void show() {
        System.out.println("本卡的显示如下：卡号是 ：" + getCardNumber() + ",用户名是：" + getUsername() + ",当前余额是 ：" + getBalance());
    }
    //get和set方法

    public PhoneCardEnum getPhoneCardEnum() {
        return phoneCardEnum;
    }

    public void setPhoneCardEnum(PhoneCardEnum phoneCardEnum) {
        this.phoneCardEnum = phoneCardEnum;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCommTime() {
        return commTime;
    }

    public void setCommTime(int commTime) {
        this.commTime = commTime;
    }

    public double getOnlineFlow() {
        return onlineFlow;
    }

    public void setOnlineFlow(double onlineFlow) {
        this.onlineFlow = onlineFlow;
    }
}
