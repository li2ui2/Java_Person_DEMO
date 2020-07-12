package myutil.testreflect.field;

import java.lang.reflect.Field;

/**
 * @author LiWei
 * @date 2020/06/11 17:09
 */
public class ChangeStringValue{
    public static void main(String[] args) throws Exception{
        String str = new String("abc");
        System.out.println(str.hashCode()+":"+str);
        // 通过反射的技术获取私有属性，并进行操作
        // 1.获取String类对应的哪个class
        Class clazz = str.getClass();
        // 2.通过clazz获取类中的value属性
        Field field = clazz.getDeclaredField("value");
        // 3.直接操作属性的值是不可以的，需要先设置私有属性可以被操作
        field.setAccessible(true);
        // 4.获取value属性里面的值（内存地址）
        // private final char[] value = {'a', 'b', 'c'}
        // field.set(str, new char[] {'b','c','d'});
        byte[] temp = (byte[]) field.get(str);
        // 通过temp的地址引用，找到真实String对象中的数组，修改数组内的每一个元素
        temp[0] = 99; temp[1] = 'c'; temp[2] = 'd';
        // 5.输出验证
        System.out.println(str.hashCode()+":"+str);
    }
}
