package bank;

/**
 * @author LiWei
 * @date 2020/06/02 21:10
 */
public class YoungMan extends Person{

    public YoungMan() {}
    public YoungMan(String name) {
        this.name = name;
    }


    // 1.进银行，叫一个号码 排队
    @Override
    public void callNumber() {
        System.out.println("自己指导在门口按按钮，拿到号码");
    }
    // 2.去窗口办理
    @Override
    public void transact() {
        System.out.println("去窗口 汇款");
    }

    // 3.办理完毕准备离开
    @Override
    public void leave() {
        System.out.println("办理完毕，迅速离开");
    }
}
