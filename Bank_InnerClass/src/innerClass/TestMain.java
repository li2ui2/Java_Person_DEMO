package innerClass;
import innerClass.Demo.InnerDemo;
import innerClass.Demo.InnerDemoStatic;

/**
 * @author LiWei
 * @date 2020/06/02 22:12
 */
public class TestMain {
    public static void main(String[] args) {
        // 内部类属于外部类（相当于一个成员）需要外部类对象才能操作
        // 创建内部类的对象---调用内部类的方法
        Demo demo = new Demo();
        // Demo.InnerDemo innerDemo = demo.new InnerDemo();
        InnerDemo innerDemo = demo.new InnerDemo();
        // 调用内部类的方法
        innerDemo.testInnerDemo();

        // 调用静态的成员内部类
        InnerDemoStatic ids = new InnerDemoStatic();
    }
}
