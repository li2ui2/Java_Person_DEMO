package myutil.testthread;

/**
 * @author LiWei
 * @date 2020/06/10 16:57
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个线程对象
        RunningMan r1 = new RunningMan("liwei");
        RunningMan r2 = new RunningMan("hahah");
        RunningMan r3 = new RunningMan("huhuh");

        // 创建Thread对象来启动线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        // 调用start方法 让线程进入就绪状态，让CPU分配资源
        t1.start();
        t2.start();
        t3.start();
    }
}
