package myutil.testthread.system12306;

/**
 * @author LiWei
 * @date 2020/06/10 21:04
 */
public class TestMain {
    public static void main(String[] args) {
        Window w1 = new Window("北京南站");
        Window w2 = new Window("北京西站");
        Window w3 = new Window("北京北站");
        w1.start();
        w2.start();
        w3.start();
    }
}
