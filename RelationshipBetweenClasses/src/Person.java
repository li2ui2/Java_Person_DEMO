/**
 * @author LiWei
 * @date 2020/05/27 19:00
 */
public class Person extends Animal{
    // 可以定义自己的方法
    public void study() {
        System.out.println("人学习的方法");
    }

    @Override
    public void eat() {
        System.out.println("人独有的吃的方法");
    }
}
