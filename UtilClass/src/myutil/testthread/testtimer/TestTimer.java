package myutil.testthread.testtimer;
import	java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Timer;

/**
 * @author LiWei
 * @date 2020/06/11 15:09
 */
public class TestTimer {
    private int count = 1;

    private ArrayList<String> userBox = new ArrayList<>();
    {
        userBox.add("a");
        userBox.add("b");
        userBox.add("c");
        userBox.add("d");
    }

    // 设计一个方法，发送垃圾数据：每个一段时间，发送一些数据
    public void test() throws ParseException {
        System.out.println("Timer计时器开始进行测试");
        Timer timer = new Timer();  // 启动一个小线程，用于记录，每隔一段时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;

        firstTime = sdf.parse("2020-6-11 15:38:00");

        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("第"+count+++"次执行");
                for (String box : userBox) {
                    System.out.println("给" + box + "发送了一条消息：[hello]");
                }
                System.out.println("垃圾数据已发送\n");
            }
        }, firstTime, 3000);  // 参数1为匿名内部类、参数2为开始执行任务的时间点、参数3表示每隔3s发一次
    }

    public static void main(String[] args) {
        TestTimer tt = new TestTimer();
        try {
            tt.test();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



}
