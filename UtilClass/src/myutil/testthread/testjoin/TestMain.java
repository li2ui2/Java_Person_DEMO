package myutil.testthread.testjoin;

/**
 * @author LiWei
 * @date 2020/06/11 14:12
 */
public class TestMain {
    public static void main(String[] args) {
        Thread1 one = new Thread1();
        //Thread2 two = new Thread2();
        one.start();
        //two.start();
    }
}
