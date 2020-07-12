package bank;

/**
 * @author LiWei
 * @date 2020/06/02 21:10
 */
public class Toff extends Person{

    public Toff() {}
    public Toff(String name) {
        this.name = name;
    }

    // 1.进银行，叫一个号码 排队
    @Override
    public void callNumber() {
        System.out.println("我是土豪，不需要叫号排队，直接进入VIP窗口");
    }
    // 2.去窗口办理
    @Override
    public void transact() {
        System.out.println("我是土豪，我要取很多钱");
    }

    // 3.办理完毕准备离开
    @Override
    public void leave() {
        System.out.println("办理完毕，帅气离开");
    }

}
