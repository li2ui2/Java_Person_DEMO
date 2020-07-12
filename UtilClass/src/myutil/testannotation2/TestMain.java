package myutil.testannotation2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author LiWei
 * @date 2020/06/12 14:45
 */
public class TestMain {
    public static void main(String[] args) throws Exception {

        // 解析Person类中 方法上面的注解信息，需要用到反射技术
        Class clazz = Class.forName("myutil.testannotation2.Person");
        Method method = clazz.getMethod("eat");
        Annotation a = method.getAnnotation(MyAnnotation.class);
        Class aclazz = a.getClass();
        Method amethod = aclazz.getMethod("value");
        String[] values = (String[]) amethod.invoke(a);
        for(String value:values) {
            System.out.println(value);
        }

        /*// 解析Person类中 属性上面的注解信息，需要用到反射技术
        // 1。获取Person对应的类Class
        Class clazz = Person.class;
        // 2.通过clazz获取里面的属性
        Field field = clazz.getDeclaredField("name");
        // 3.通过filed获取上面的注解对象
        Annotation a = field.getAnnotation(MyAnnotation.class);
        // 4.利用反射执行a中的value方法
        Class aclazz = a.getClass();  // a对象获取注解对应的class
        // 5.通过aclazz获取里面的value方法
        Method amethod = aclazz.getMethod("value");
        // 6.执行value的方法，获取传递的信息
        String[] values = (String[]) amethod.invoke(a);

        // 正常的对象调用执行过程如下
        // 3.通过filed获取上面的注解对象
        // MyAnnotation a = (MyAnnotation) field.getAnnotation(MyAnnotation.class);
        // 4.利用a对象执行以下value方法，帮我们搬运过来
        // String[] values = a.value();
        for(String value:values) {
            System.out.println(value);
        }*/

    }
}
