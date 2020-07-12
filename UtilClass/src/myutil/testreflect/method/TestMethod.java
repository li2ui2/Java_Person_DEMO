package myutil.testreflect.method;

import java.lang.reflect.Method;

/**
 * @author LiWei
 * @date 2020/06/11 19:51
 */
public class TestMethod {
    public static void main(String[] args) throws Exception {

        /*try {
            // 获取Person对应的Class
            Class<Person> clazz = Person.class;
            Person p = (Person) clazz.newInstance();
            // 通过clazz获取其中的方法
            // 通过方法名字定位的方法，通过方法参数类型对应的Class来寻找
            Method m1 = clazz.getMethod("eat");
            Method m2 = clazz.getMethod("eat", String.class);
            int mm = m1.getModifiers();  // 获取方法的修饰符（权限+特征）
            Class mrt = m1.getReturnType();  // 获取返回值数据类型
            String mn = m1.getName();  // 获取方法名字
            Class[] mpts = m2.getParameterTypes();  // 获取方法参数列表的类型
            Class[] mets = m1.getExceptionTypes();// 获取方法抛出异常的类型
            String result = (String) m2.invoke(p, "测试参数");
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // 获取Person对应的Class
        Class<Person> clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        /*Method m = clazz.getMethod("sleep");
        m.invoke(p);

        Method[] ms = clazz.getMethods();
        for (Method v : ms) {
            System.out.println(v);
        }*/
        Method m = clazz.getDeclaredMethod("testPrivate");
        System.out.println(m);
        m.setAccessible(true);
        m.invoke(p);
    }
}
