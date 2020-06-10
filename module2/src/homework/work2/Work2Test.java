package homework.work2;

/**
 * 测试类
 */
public class Work2Test {
    public static void main(String[] args) {
        //创建一个手机卡
        PhoneCard phoneCard = new PhoneCard();
        //设置参数
        phoneCard.setBalance(1000.0);
        phoneCard.setUsername("张三");
        phoneCard.setCardNumber("S1001");
        phoneCard.setPhoneCardEnum(PhoneCardEnum.BigCard);
        //创建上网套餐对象，接口指向实现类
        OnlineInterface onlineInterface = new OnlinePackage();
        onlineInterface.show(11.2,phoneCard);

        //创建通话套餐对象，接口指向实现类
        TalkInterface talkInterface = new TalkPackage(88.8,1000,100);
        talkInterface.show(11,phoneCard);



        //创建抽象类对象指向上网套餐类
        PackageAbstract packageAbstract = new OnlinePackage(888,100);
        packageAbstract.setMonthPrice(888);
        packageAbstract.show();

        //创建抽象类对象指向通话套餐类
        PackageAbstract packageAbstract1 = new TalkPackage(1000,100,100);
        packageAbstract1.setMonthPrice(888);
        packageAbstract1.show();




    }


}
