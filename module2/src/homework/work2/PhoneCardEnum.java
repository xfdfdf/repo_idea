package homework.work2;

/**
 * 枚举类：手机卡的类型
 */
public enum PhoneCardEnum {
    BigCard("大卡"),SmallCard("小卡"),MiniCard("微型卡");
    private String desc;


     private PhoneCardEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
         return this.desc;

    }
}
