package myutil.testgui.ExamSystem.domain;

/**
 * @author LiWei
 * @date 2020/06/13 21:00
 * <p>
 * domain实体对象，用来存储dbfile中文件中的一行记录
 * 文件名------------类名
 * 文件名一行记录-----类的对象
 * 文件一行中的值-----对象的属性对应
 */


public class User {
    private String account;  // 用来存储账号
    private String password;  // 用来村塾密码

    public User() {
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
