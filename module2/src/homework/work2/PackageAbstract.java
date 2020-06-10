package homework.work2;

/**
 * 套餐的抽象类
 */
public abstract class PackageAbstract {
    //每月资费
    private double monthPrice;

    public PackageAbstract() {

    }

    //显示所有的套餐信息
    public abstract void show();

    public PackageAbstract(double monthPrice) {
        this.monthPrice = monthPrice;
    }

    public double getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(double monthPrice) {
        if (monthPrice >= 0) {
            this.monthPrice = monthPrice;
        } else {
            System.out.println("每月资费不能小于0");
        }
    }
}
