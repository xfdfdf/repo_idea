package task10;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)  //表示下面的注解在源代码中有效
//@Retention(RetentionPolicy.CLASS)  //表示下面的注解在字节码文件中有效，默认方式
//@Retention(RetentionPolicy.RUNTIME)  //表示下面的注解在运行中有效
@Documented
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE})
@Inherited
public @interface MyAnnotation {
    public String value() ;
    public String value1() default "haha";
}
