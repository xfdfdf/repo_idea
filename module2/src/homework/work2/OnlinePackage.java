package homework.work2;

/**
 * 上网套餐类
 */
public class OnlinePackage extends PackageAbstract  implements OnlineInterface {
    //上网流量
    private double onlineFlow;

    public OnlinePackage() {
        super();
    }

    public double getOnlineFlow() {
        return onlineFlow;
    }

    public void setOnlineFlow(double onlineFlow) {
        if(onlineFlow >= 0) {
            this.onlineFlow = onlineFlow;
        } else {
            System.out.println("上网流量不能小于0");
        }
    }

    public OnlinePackage(double monthPrice, double onlineFlow) {
        super(monthPrice);
        this.onlineFlow = onlineFlow;
    }

    @Override
    public void show() {
        System.out.println("上网流量是 ：" + this.onlineFlow + "G,每月资费是：" + getMonthPrice());
    }

    @Override
    public void show(double onlineFlow, PhoneCard phoneCard) {
        System.out.print("上网流量是 ：" + onlineFlow + ",");
        phoneCard.show();
    }
}
