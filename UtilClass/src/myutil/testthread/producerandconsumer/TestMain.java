package myutil.testthread.producerandconsumer;

import java.io.Writer;

/**
 * @author LiWei
 * @date 2020/06/10 21:45
 */
public class TestMain {
    public static void main(String[] args) {
        WareHouse house = new WareHouse(); // 里面有一个ArrayList线程非安全
        Producer p = new Producer(house);
        // 设置线程的优先级别1-10
        p.setPriority(10);

        Consumer c1 = new Consumer(house);
        Consumer c2 = new Consumer(house);
        p.start();
        c1.start();
        c2.start();

    }
}
