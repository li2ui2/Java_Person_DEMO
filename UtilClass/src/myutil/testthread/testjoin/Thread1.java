package myutil.testthread.testjoin;

/**
 * @author LiWei
 * @date 2020/06/11 14:09
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("thread1 start");
        Thread2 two = new Thread2();
        two.start();
        try {
            two.join(2000);  // 线程2加入线程1里面
            //

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread1 end");
    }
}
