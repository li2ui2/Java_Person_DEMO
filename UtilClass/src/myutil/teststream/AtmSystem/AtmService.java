package myutil.teststream.AtmSystem;


import java.util.jar.Attributes;

/**
 * @author LiWei
 * @date 2020/06/10 10:13
 */
public class AtmService {

    // 此类负责处理业务逻辑，需要底层数据的支持
    private final AtmDao dao = new AtmDao();

    // 网络银行的业务
    // 所有的业务方法，按照之前的优化结构设计，只有业务逻辑、判断、比较、计算等等
    // 看不见任何数据的操作   从哪儿查出来的 存在哪儿的
    // 设计一个业务方法 登录
    public String login(String name, String password) {
        User user = dao.selectUser(name);
        if (user != null && user.getPassword().equals(password)) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }

    // 设计一个业务方法，查询余额
    public Float queryBalance(String name) {
        User user = dao.selectUser(name);;
        return user.getBalance();
    }

    // 设计一个业务方法，存款
    public void deposit(String name, Float depositMoney) {
        // 先将集合内的数据做修改，找到某一个user对象，对象中的balance属性进行修改
        User user = dao.selectUser(name);
        user.setBalance(user.getBalance() + depositMoney);
        dao.updateUser(user);
        // 将集合内所有最终的数据全部写入文件中，文件内的所有内容替换掉
        // dao.commit();  // 提交，将临时的数据永久写入文件
    }

    // 设计一个业务方法，存款
    public void withdrawal(String name, Float withdrawalMoney) {
        // 先将集合内的数据做修改，找到某一个user对象，对象中的balance属性进行修改
        User user = dao.selectUser(name);
        if (user.getBalance()>withdrawalMoney) {
            user.setBalance(user.getBalance() - withdrawalMoney);
            dao.updateUser(user);
            // 将集合内所有最终的数据全部写入文件中，文件内的所有内容替换掉
            // dao.commit();  // 提交，将临时的数据永久写入文件
        }else {
            System.out.println("对不起" + name + ", 您的账户余额不足");
        }
    }

    // 设计一个业务方法，转账
    public void transfer(String outName, String inName, Float transferMoney) {
        // 先将集合内的数据做修改，找到某一个user对象，对象中的balance属性进行修改
        User outUser = dao.selectUser(outName);
        if (outUser.getBalance()>transferMoney) {
            User inUser = dao.selectUser(inName);
            if (inUser != null) {  // 转入账户存在
                outUser.setBalance(outUser.getBalance() - transferMoney);
                inUser.setBalance(inUser.getBalance() + transferMoney);
                dao.updateUser(outUser);
                dao.updateUser(inUser);
                // 将集合内所有最终的数据全部写入文件中，文件内的所有内容替换掉
                // dao.commit();  // 提交，将临时的数据永久写入文件
            }else {
                System.out.println("对不起，您输入的转入账户不存在");
            }

        }else {
            System.out.println("对不起" + outName + ", 您的账户余额不足");
        }
    }

}
