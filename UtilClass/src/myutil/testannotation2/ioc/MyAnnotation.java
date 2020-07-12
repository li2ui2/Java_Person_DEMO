package myutil.testannotation2.ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author LiWei
 * @date 2020/06/12 13:16
 */

@Target({ElementType.CONSTRUCTOR,ElementType.METHOD, ElementType.FIELD})  // 描述注解放置的位置
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // String test = "test";  // 静态常量属性，通常不使用
    // String[] value() default "liwei";  // 默认方法--->属性
    String[] value();

}
