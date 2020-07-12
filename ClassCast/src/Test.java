/**
 * @author LiWei
 * @date 2020/06/02 16:55
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象
        Person p = new Teacher();  // 自动向上转型 Teacher ---> Person
        p.eat();
        p.sleep();
        p.talk();
        // 如果想要调用子类独有的属性或方法
        // 需要将类型还原回真实类型，进行强制类型转换  造型  向上转型  向下转型
        Teacher t = (Teacher)p;
        t.eat();
        t.sleep();
        t.teach();

    }
}
