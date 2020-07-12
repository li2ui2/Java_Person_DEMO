package myutil.testreflect.field;

import java.lang.reflect.Field;

/**
 * @author LiWei
 * @date 2020/06/11 16:13
 */
public class TestMain {
    public static void main(String[] args) {

        try {
            /*// 通过一个Class对象来操作Person.class类
            Class clazz = Class.forName("myutil.testreflect.field.Person");
            // 类有自己的结构，包括权限修饰符、特征修饰符、类名字、继承、实现等

            // 每一个修饰符用一个整数来表示，从0开始---0 1 2 4 8 16 32 64 128 256 512
            // 0--默认不写  1--public   2--private  4--protected
            // 8--static    16--final   32--synchronized    64--volatile
            // 128--transient   256--native 512--interface  1024--abstract
            int modifiers = clazz.getModifiers();
            System.out.println(modifiers);

            // 类的名字
            String name = clazz.getName();
            String simpleName = clazz.getSimpleName();
            System.out.println(name);  // 类全名
            System.out.println(simpleName);  // 类名

            // 获取包名
            Package p = clazz.getPackage();
            System.out.println(p.getName());

            // 获取当前class的父类
            Class sclass = clazz.getSuperclass();
            System.out.println(sclass.getName());*/

            /*ArrayList<String> list = new ArrayList<>();
            // 获取集合对象属于哪个父类
            Class clazz = ArrayList.class;
            Class sclazz = clazz.getSuperclass();
            while (sclazz != null) {
                System.out.println(sclazz.getName());
                sclazz = sclazz.getSuperclass();
            }

            // 获取当前clazz的所有父亲接口
            Class[] classes = clazz.getInterfaces();
            for(Class c : classes) {
                System.out.println(c.getName());
            }*/

            /*Class clazz = Class.forName("myutil.testreflect.field.Person");
            Person p = (Person) clazz.newInstance();  // 相当于调用person类中的默认无参数的构造方法拆功能键对象
            // System.out.println(p);

            // 通过clazz来获取类中的属性
            Field nameField = clazz.getField("name");
            int modifiers = nameField.getModifiers();  // 属性的修饰符
            System.out.println(modifiers);
            Class fclass = nameField.getType();  // 获取属性的类型
            System.out.println(fclass.getName());
            String fname = nameField.getName();  // 获取属性的名字
            System.out.println(fname);*/

            Class clazz = Class.forName("myutil.testreflect.field.Person");
            // Person p = new Person();
            Person p = (Person) clazz.newInstance();
            // 通过clazz来获取类中的属性
            /*Field nameField = clazz.getField("name");  // 局限在于需要指导属性名字是什么，且属性需要是公有的
            nameField.set(p, "李伟");  // 赋值
            System.out.println(p);
            String name = (String) nameField.get(p);  // 取值
            System.out.println(name);

            Field[] fields = clazz.getFields();  // 获取全部公有属性，包括父类继承过来的
            System.out.println(fields.length);*/

            Field f = clazz.getDeclaredField("name"); // name名字
            f.setAccessible(true);  // 表示私有属性可以直接被操作
            f.set(p, "哈哈");
            String value = (String) f.get(p);
            System.out.println(value);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
