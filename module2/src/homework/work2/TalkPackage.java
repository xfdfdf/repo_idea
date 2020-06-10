package homework.work2;

import task10.StaticOutTest;


/**
 * 通话套餐
 */
public class TalkPackage extends PackageAbstract implements TalkInterface{
    private int commTime;  //通话时长
    private int messageNum;  //短信条数

    public int getCommTime() {
        return commTime;
    }

    public void setCommTime(int commTime) {
        if(commTime > -1) {
            this.commTime = commTime;

        } else {
            System.out.println("短信条数不能小于0");
        }
    }

    public int getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(int messageNum) {
        if(messageNum > -1) {
            this.messageNum = messageNum;

        } else {
            System.out.println("短信条数不能小于0");
        }
    }

    public TalkPackage(double monthPrice,int commTime,int messageNum) {
        super(monthPrice);
        setCommTime(commTime);
        setMessageNum(messageNum);
    }


    @Override
    public void show() {
        System.out.println("通话套餐的信息如下：通话时长是：" + getCommTime() + ",短信条数：" + getMessageNum() + ",每月资费是： " + getMonthPrice());
    }

    @Override
    public void show(int commTime, PhoneCard phoneCard) {
        System.out.print("通话时间是 " + commTime+ ",");
        phoneCard.show();
    }
}
