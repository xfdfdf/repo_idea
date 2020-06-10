package task10;

import org.junit.Test;

public enum Week {
    day1("星期一"),dat2("星期二");


    public final String desc;

    Week(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return this.desc;
    }
    @Test
    public void test() {
        Week w = Week.dat2;
        System.out.println(w.getDesc());
    }
}
