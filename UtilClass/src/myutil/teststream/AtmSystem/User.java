package myutil.teststream.AtmSystem;

import java.io.Serializable;

/**
 * @author LiWei
 * @date 2020/06/10 10:21
 */
public class User implements Serializable {
    // 除了类的私有属性、无参数有参数构造方法、属性对应的get、set方法，
    // 最好实现一个序列化接口，并添加一个序列化版本号
    private static final long serialVersionUID = 9200019794189619320L;

    // 以下属性用于记录数据库中的一行信息， 账号 密码 余额
    private String name;
    private String password;
    private Float balance;

    public User() {}
    public User(String name, String password, Float balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Float getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
