package myutil.testreflect.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/06/11 21:14
 */
public class MySpring {


    // 设计一个方法，用于控制对象的创建
    public Object getBean(String className) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("请给" + className + "类的对象赋值");
        Object obj = null;
        // 获取方法传递进来的参数对应的类
        Class clazz = Class.forName(className);
        // 通过clazz创建一个对象
        obj = clazz.newInstance();
        // 在这里做一个自动DI的注入对象中的所有属性值 set
        // 找到每一个不同对象中给的所有set方法，给属性赋值
        // 通过拼接字符串的方式处理名字
        // 1.通过clazz找寻类中的所有私有属性-->获取每一个属性的名字-->set属性
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            // 获取属性名
            String fieldName = field.getName();
            // 2.拼接属性对应的set方法名
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String otherLetters = fieldName.substring(1);
            StringBuilder setMethodName = new StringBuilder("set");
            setMethodName.append(firstLetter);
            setMethodName.append(otherLetters);
            // 3.获取field对应的属性类型-->找寻set方法时候传递参数用
            Class fieldClass = field.getType();
            // 4.通过处理号的set方法名，找寻类中的set方法
            Method setMethod = clazz.getMethod(setMethodName.toString(), fieldClass);
            // 5.找到setMethod一执行，属性就赋值成功
            System.out.println("请给" + fieldName + "属性提供值");
            String value = input.nextLine();
            // 需要执行属性对应的set方法，给属性赋值，方法就ok了
            // 属性的值目前是通过Scanner接收过来的，都是String类型
            // 执行set方法的时候，方法需要的值不一定都是String类型，可能是Integer、Float等类型
            // 八个包装类有七个都含有带String的构造方法
            // 可以利用包装类带String的构造方法处理，找属性类型对应的带String参数的构造方法
            // 以下方法除了char方法以外都可以运行
            Constructor con = fieldClass.getConstructor(String.class);
            setMethod.invoke(obj, con.newInstance(value));  // value值得类型应该是属性得类型
        }
        return obj;
    }
}
