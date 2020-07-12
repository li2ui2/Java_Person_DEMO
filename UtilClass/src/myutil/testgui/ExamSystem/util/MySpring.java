package myutil.testgui.ExamSystem.util;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * @author LiWei
 * @date 2020/06/13 22:51
 * 此类的目的是为了管理对象的产生
 * 将对象的控制权交给当前类来负责 IOC反转控制
 * <p>
 * 本类实现了生命周期托管的方式实现了对象的单例
 */
public class MySpring {

    // 属性--为了存储所有被管理的对象
    private static HashMap<String, Object> beanBox = new HashMap<>();

    // 设计一个方法，获取任何一个类的对象
    public static <T> T getBean(String className) {  // 传递一个类全名
        T obj = null;
        try {
            // 1.直接取beanBox中获取
            obj = (T) beanBox.get(className);
            // 2.如果obj是null，证明之前没有创建过这个对象
            if (obj == null) {
                // 3.通过类名字获取Class
                Class clazz = Class.forName(className);
                // 4.通过反射产生一个对象
                Constructor con = clazz.getConstructor();  // 找到无参数的构造方法
                obj = (T) con.newInstance();
                // 5.将新的对象存入集合
                beanBox.put(className, obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

}
