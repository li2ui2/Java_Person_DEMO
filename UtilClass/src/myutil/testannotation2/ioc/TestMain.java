package myutil.testannotation2.ioc;

/**
 * @author LiWei
 * @date 2020/06/12 15:58
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        // 获取一个Person类型的对象
        /*// 方式1.自己创建对象
        Person2 p = new Person2();
        p.setName("liwei");
        p.setAge(18);
        p.setSex("男");*/

        // 方式2.获取一个Person对象，不用自己处理，通过MySpring获取
        // 对象的创建权力反转(IOC) 赋值(自动DI) 都交由MySpring来处理
        Myspring ms = new Myspring();  // 管理者，帮我们创建对象，自动赋值
        Person2 p = (Person2) ms.getBean("myutil.testannotation2.ioc.Person2");
        System.out.println(p.getName() + "--" + p.getAge() + "--" + p.getSex());
    }
}
