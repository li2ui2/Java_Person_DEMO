package bank;

import java.awt.*;

/**
 * @author LiWei
 * @date 2020/06/02 21:20
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        /*OldMan om = new OldMan("长者");
        bank.profession(om);  // 银行欢迎长者进来办理业务

        YoungMan ym = new YoungMan("年轻人");
        bank.profession(ym);  // 银行欢迎长者进来办理业务

        Toff t = new Toff("土豪");
        bank.profession(t);  // 银行欢迎长者进来办理业务

        // 按照以上的设计，会出现问题
        // 1.三个不同的人类方法名不一致
        // 2.银行办理业务的方法写了三个
        // 解决如上所述的问题    可以在三个人类之上创建一个父类
        // 1.解决三个人类中的相同代码，比如name属性 比图get方法之类的
        // 2.父类定义的三个方法可以是抽象的，解决了子类命名不一致的问题，子类执行也不一致
        // 2.父类可以作为参数传入银行*/

        Person p1 = new Toff("土豪");
        bank.profession(p1);

        Person p2 = new YoungMan("年轻人");
        bank.profession(p2);

        Person p3 = new YoungMan("长者");
        bank.profession(p3);
    }
}
