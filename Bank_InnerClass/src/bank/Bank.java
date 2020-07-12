package bank;

import java.io.PrintStream;

/**
 * @author LiWei
 * @date 2020/06/02 21:10
 */
public class Bank {
    // 开们 等待用户进来办理业务
    public void profession(Person person) {
        System.out.println(person.getName() + "客户进入银行啦");
        person.callNumber();
        person.transact();
        person.leave();
    }
}
