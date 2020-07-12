package myutil.testannotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author LiWei
 * @date 2020/06/12 10:02
 */

@Target({METHOD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // 接口：公有静态常量属性、公有抽象的方法
    public static final String xxx = "field";
    public String test();  // 方法是不做事情的，是为了携带信息
    public int value();
}
