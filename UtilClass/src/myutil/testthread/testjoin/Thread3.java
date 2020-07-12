package myutil.testthread.testjoin;

/**
 * @author LiWei
 * @date 2020/06/11 14:30
 */
public class Thread3 extends Thread{

    private Thread2 two;

    public Thread3(Thread2 two) {
        this.two = two;
    }

    @Override
    public void run() {
        // 在Thread2执行的过程中，即Thread1等待的过程中，Thread3将Thread2对象锁定
        System.out.println("Thread3 start");
        synchronized (two) {
            System.out.println("Thread2 is locked");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2 is released");
        }
        System.out.println("Thread3 end");
    }
}
