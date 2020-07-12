package bank;

/**
 * @author LiWei
 * @date 2020/06/02 21:31
 */
public abstract class Person {
    protected String name;  // 只能让本类或者子类使用该属性

    public String getName() {
        return this.name;
    }

    // 1.进银行，叫一个号码 排队
    public abstract void callNumber();

    // 2.去窗口办理
    public abstract void transact();

    // 3.办理完毕准备离开
    public abstract void leave();
}
