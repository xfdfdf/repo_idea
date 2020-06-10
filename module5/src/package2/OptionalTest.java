package package2;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {
        String str = null;
        if(null != str) {
            System.out.println("字符串 " + str + "的长度是：" + str.length());
        } else {
            System.out.println("字符串为null,因此长度为0");
        }

        Optional<String> optional = Optional.ofNullable(str);
        Optional<Integer> integer = optional.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        System.out.println("integer = " + integer);
        integer = optional.map(String::length);
        System.out.println("integer = " + integer);
        integer = optional.map((s) ->{return s.length();});
        System.out.println("integer = " + integer);
        System.out.println(integer.orElse(0));
    }
}
