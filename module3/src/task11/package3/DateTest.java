package task11.package3;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        Date d2 = new Date(1000);
        System.out.println("d2 = " + d2);
        long msc = d2.getTime();
        System.out.println(msc);
        d2.setTime(10000);
        System.out.println("d2 = " + d2);

    }
}
