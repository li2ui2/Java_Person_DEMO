package abstracttt;

/**
 * @author LiWei
 * @date 2020/06/01 21:37
 */
public class Person extends Animal {
    @Override
    public void eat() {
        System.out.println("人是高级动物，吃饭有讲究");
    }
    @Override
    public void sleep() {
        System.out.println("人是高级动物，睡觉有讲究");
    }

}
