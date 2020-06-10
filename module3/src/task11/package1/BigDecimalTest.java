package task11.package1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.jar.JarOutputStream;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("12.4");
        BigDecimal b2 = new BigDecimal("5.23424234234234234");
        System.out.println(b1.multiply(b2));
        System.out.println(5.23424234234234234 * 12.4);
        //实现精确计算
        BigDecimal b3 = new BigDecimal("0.1");
        BigDecimal b4 = new BigDecimal("0.2");
        System.out.println(b3.add(b4));
        System.out.println(0.1 + 0.2);

        //注意事项
        BigDecimal b5 = new BigDecimal("10");
        BigDecimal b6 = new BigDecimal("0.3");

        System.out.println(b5.divide(b6,BigDecimal.ROUND_HALF_UP));
        System.out.println(b5.divide(b6, RoundingMode.HALF_UP));
        System.out.println(b5.divide(b6, RoundingMode.HALF_DOWN));
        System.out.println(b5.divide(b6, RoundingMode.HALF_EVEN));

    }
}
