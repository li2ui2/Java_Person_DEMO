package bank;

/**
 * @author LiWei
 * @date 2020/06/02 21:10
 */
public class OldMan extends Person {

    public OldMan() {}
    public OldMan(String name) {
        this.name = name;
    }


    // 1.进银行，叫一个号码 排队
    @Override
    public void callNumber() {
        System.out.println("年事已高，请求大堂经理的帮忙");
    }
    // 2.去窗口办理
    @Override
    public void transact() {
        System.out.println("到窗口 掏出手绢 拿出存折 取钱");
    }

    // 3.办理完毕准备离开
    @Override
    public void leave() {
        System.out.println("办理完毕，然后离开");
    }
}
