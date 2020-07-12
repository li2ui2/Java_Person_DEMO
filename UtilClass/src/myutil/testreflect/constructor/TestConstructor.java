package myutil.testreflect.constructor;
import	java.lang.instrument.ClassFileTransformer;

import java.lang.reflect.Constructor;

/**
 * @author LiWei
 * @date 2020/06/11 20:49
 */
public class TestConstructor {
    public static void main(String[] args) throws Exception {
        // 找到person对应的class
        Class<Person> clazz = Person.class;
        // 找寻clazz中的无参数构造方法
        Constructor<Person> c = clazz.getConstructor();
        // System.out.println(c);
        // 执行构造方法
        Person p = c.newInstance();
        // System.out.println(p);

        Constructor<Person> c2 = clazz.getConstructor(String.class);
        Person p2 = c2.newInstance("name");

        Constructor<Person>[] cons = (Constructor<Person>[]) clazz.getConstructors();
    }

}
