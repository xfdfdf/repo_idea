package task11.package3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        //1.获取当前日期信息并且打印
        LocalDate now = LocalDate.now();
        System.out.println("获取到的当前日期是：" + now);
        //2.获取当前时间信息并且打印（时-分-秒）
        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的当前时间是：" + now1);
        //3.获取当前时间信息并且打印，使用最多
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取到的当前日期时间是：" + now2);
        System.out.println("********************");

        LocalDateTime now3 = LocalDateTime.of(2011,11,11,11,11,11);
        System.out.println(now3);

        System.out.println("获取到的年：" + now3.getYear());
        System.out.println("获取到的月：" + now3.getMonthValue());
        System.out.println("获取到的日：" + now3.getDayOfMonth());
        System.out.println("获取到的时：" + now3.getHour());
        System.out.println("获取到的分：" + now3.getMinute());
        System.out.println("获取到的秒：" + now3.getSecond());
        System.out.println("***************************");
        //LoclaDateTime具有不可变性
        LocalDateTime localDateTime = now3.withYear(2012);
        System.out.println("now3 = " + now3);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime t1 = localDateTime.withMonth(1);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("t1 = " + t1);

        LocalDateTime t2 = t1.withDayOfMonth(22);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);


        //增加特征并且打印
        LocalDateTime localDateTime2 = localDateTime.plusDays(12);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime2 = " + localDateTime2);
        LocalDateTime localDateTime3 = localDateTime2.plusHours(30);
        System.out.println("localDateTime3 = " + localDateTime3);
        System.out.println("*****************************");
        //实现特征的减少并且打印
        LocalDateTime localDateTime4 = localDateTime3.minusMinutes(12);
        System.out.println("localDatetime4 = " + localDateTime4);

        LocalDateTime localDateTime5 = localDateTime4.minusSeconds(4);
        System.out.println("localDatetime5 = " + localDateTime5);



    }
}
