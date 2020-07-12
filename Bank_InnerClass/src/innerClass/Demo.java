package innerClass;

/**
 * @author LiWei
 * @date 2020/06/02 22:06
 */
public class Demo {
    private final String name = "这是正常类中的属性";
    public void testDemo() {
        System.out.println("这是正常类中的方法");
    }
    // 成员内部类
    public class InnerDemo{
        private final String name = "我是内部类中的属性";

        public void testInnerDemo() {
            System.out.println("我是成员内部类中的方法" + Demo.this.name);
            testDemo();
        }
    }

    public static class InnerDemoStatic{
        private final String nameStatic = "我是内部类中的属性";
    }
}
