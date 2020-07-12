package myutil.testthread.testjoin;

/**
 * @author LiWei
 * @date 2020/06/11 14:09
 */
public class Thread2 extends Thread{

    @Override
    public void run() {
        System.out.println("thread2 start");
        Thread3 three = new Thread3(this);
        three.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2 end");
    }
}
