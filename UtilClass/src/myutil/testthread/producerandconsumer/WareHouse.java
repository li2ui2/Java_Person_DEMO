package myutil.testthread.producerandconsumer;
import	java.util.ArrayList;

/**
 * @author LiWei
 * @date 2020/06/10 21:32
 */
public class WareHouse {

    // 仓库里边的集合，用于存放元素
    private ArrayList<String> list = new ArrayList<>();

    // 向集合内添加元素的方法
    public synchronized void add() {
        if(list.size() < 20) {
            list.add("a");
        }else {
            // return;
            try {
                this.notifyAll();
                this.wait();  // 仓库WareHouse调用wait，不是仓库对象等待，是访问仓库的生产者线程进入等待的状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 从集合内获取元素的方法
    public synchronized void get() {
        if (list.size() > 0) {
            list.remove(0);  // 可能产生集合越界问题
        }else {
            // return;
            try {
                this.notifyAll();
                this.wait();  // 仓库WareHouse调用wait，不是仓库对象等待，是访问仓库的消费者线程进入等待的状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
