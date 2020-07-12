/**
 * @author LiWei
 * @date 2020/05/27 10:47
 */
public class TestConstructor {
    public String name;
    public int age;
    public String sex;

    public TestConstructor() {
        System.out.println("无参数的默认构造方法，建议在创建自定义构造方法时，保留");
    }
    public TestConstructor(String name, int age, String sex) {
        this();  // 调用默认的构造方法
        // 创建了一个对象（开辟空间）
        this.name = name;
        this.age = age;
        this.sex = sex;
        // 返回了创建的这个对象空间的引用
    }
    static {
        System.out.println("程序块测试，在构造方法调用前，我会被自动调用");
    }
    static {
        System.out.println("程序块测试，在构造方法调用前，我也被自动调用");
    }
}
