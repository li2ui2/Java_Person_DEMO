package myutil.testthread.philosopher;

/**
 * @author LiWei
 * @date 2020/06/11 14:47
 */
public class Philosopher extends Thread{

    private String pname;  // 哲学家名字
    private Chopstick left;
    private Chopstick right;
    private long time;

    public Philosopher(String pname, Chopstick left, Chopstick right, long time) {
        this.pname = pname;
        this.left = left;
        this.right = right;
        this.time = time;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Chopstick getLeft() {
        return left;
    }

    public void setLeft(Chopstick left) {
        this.left = left;
    }

    public Chopstick getRight() {
        return right;
    }

    public void setRight(Chopstick right) {
        this.right = right;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public void run () {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (left) {
            System.out.println(this.pname+"拿起了左手边的"+this.left.getNum()+"筷子");
            synchronized (right) {
                System.out.println(this.pname+"拿起了右手边的"+this.right.getNum()+"筷子");
                System.out.println(this.pname+"开始吃饭");
            }
        }
    }
}
