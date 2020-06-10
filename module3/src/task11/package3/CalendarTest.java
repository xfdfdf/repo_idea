package task11.package3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Date d1 = new Date(2009 - 1900,14 - 1,8,23,12,1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = sdf.format(d1);
        System.out.println(str1);
        System.out.println("*******************************");
        Calendar instance = Calendar.getInstance();
        instance.set(2008,8 - 1,8,20,8,8);
        Date d2 = instance.getTime();
        System.out.println(d2);
        String s = sdf.format(d2);
        System.out.println(s);

        System.out.println("-----------------------------------------------------");
        // 3.向指定的字段设置以及增加指定的数值
        instance.set(Calendar.YEAR,2018);
        Date d3 = instance.getTime();
        System.out.println(sdf.format(d3));

        instance.set(Calendar.MONTH,8);
        Date d4 = instance.getTime();
        System.out.println(sdf.format(d4));

    }
}
