package myutil.testthread.producerandconsumer;

/**
 * @author LiWei
 * @date 2020/06/10 21:31
 */
public class Producer extends Thread{

    // 为了保证生产者和消费者使用同一个仓库对象，添加一个属性
    private WareHouse house;
    public Producer(WareHouse house) {
        this.house = house;
    }

    // 生产者的run方法，一直向仓库内添加元素
    @Override
    public void run() {
        while (true) {
            house.add();
            System.out.println("生产者存入了一件货物");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
