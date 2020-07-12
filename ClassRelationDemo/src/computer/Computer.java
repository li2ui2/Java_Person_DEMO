package computer;

/**
 * @author LiWei
 * @date 2020/05/31 14:06
 */
public class Computer {

    // 属性--描述自身的状态
    private int number;  //电脑编号
    private boolean used = false;  // true为开着，false为关着

    // 设计构造方法
    public Computer() {}
    public Computer(int number) {
        this.number = number;
    }

    // 设计两个方法，获取电脑的编号和电脑的状态
    public int getNumber(){
        return this.number;
    }
    public boolean isUsed() {
        return this.used;
    }

    // 设计普通方法--被打开、使用、关闭
    public void beOpen() {
        this.used = true; //切换状态为开着的
        System.out.println(this.number + "号电脑被打开了");
    }
    public void beUsing() {
        System.out.println(this.number + "号电脑正在被使用中...");
    }
    public void beClosed() {
        this.used = false; //切换状态为开着的
        System.out.println(this.number + "号电脑正在被关闭了");
    }
}
