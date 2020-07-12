package myutil.testreflect.constructor;

/**
 * @author LiWei
 * @date 2020/06/11 20:49
 */
public class Person {
    public Person() {
        System.out.println("我是Person类无参数的构造方法");
    }

    public Person(String str) {
        System.out.println("我是Person类有参数的构造方法");
    }


}
