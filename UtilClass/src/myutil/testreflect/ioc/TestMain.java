package myutil.testreflect.ioc;

/**
 * @author LiWei
 * @date 2020/06/11 21:20
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 创建一个Question对象，对象的控制权交由Spring类来处理--IOC
        MySpring spring = new MySpring();
        /*Question question = (Question) spring.getBean("myutil.testreflect.ioc.Question");
        System.out.println(question);*/

        Person person = (Person) spring.getBean("myutil.testreflect.ioc.Person");
        System.out.println(person);
    }
}
