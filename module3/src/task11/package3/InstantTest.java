package task11.package3;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的日期时间为：" + offsetDateTime);
        System.out.println("*************************");
        long g1 = now.toEpochMilli();
        System.out.println("获取到的毫秒差为：" + g1);
        System.out.println("获取到的毫秒差为：" + System.currentTimeMillis());
        System.out.println("获取到的毫秒差为：" + new Date().getTime());
        //根据参数指定的毫秒数来构造对象
        Instant i1 = Instant.ofEpochMilli(g1);
        System.out.println("根据参数构造的对象为：" + i1);
    }
}
