package myutil.testthread.system12306;

/**
 * @author LiWei
 * @date 2020/06/10 17:17
 */
public class Window extends Thread{
    private String windowName;  // 窗口名字

    public Window(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public void run() {
        this.sellTicket();
    }

    public void sellTicket() {
        while (true) {
            System12306 sys = System12306.getInstance();
            Ticket ticket = sys.getTicket();  // Vector
            if (ticket == null) {
                System.out.println("对不起" + windowName + "窗口车票已售完");
                break;
            }
            System.out.println("从" + windowName + "售出：" + ticket);
        }
    }
}
