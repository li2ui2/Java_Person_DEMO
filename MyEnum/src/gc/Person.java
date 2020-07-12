package gc;

/**
 * @author LiWei
 * @date 2020/06/04 11:18
 */
public class Person {
    // 默认继承Object
    public Person() {
        System.out.println("person对象被创建啦");
    }
    @Override
    public void finalize() {
        // 在对象被GC回收的时候，默认调用执行
        System.out.println("person对象被回收啦");
    }
}
