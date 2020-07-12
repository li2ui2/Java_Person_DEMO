package myutil.testthread.producerandconsumer;

/**
 * @author LiWei
 * @date 2020/06/10 21:32
 */
public class Consumer extends Thread{

    // 为了保证生产者和消费者使用同一个仓库对象，添加一个属性
    private WareHouse house;

    public Consumer(WareHouse house) {
        this.house = house;
    }
    // 消费者的方法，一直从仓库内获取元素
    @Override
    public void run() {
        while (true) {
            house.get();
            System.out.println("消费者拿走了一件货物");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
