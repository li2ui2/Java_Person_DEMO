package gc;
import	java.net.Socket;

/**
 * @author LiWei
 * @date 2020/06/04 11:18
 */
public class Test {
    public static void main(String[] args) {
        /*Person p = new Person();
        try {
            Thread.sleep(2000); 
        }catch (Exception ignored) {

        }
        p = null;
        System.gc();  // 默认调用执行person类中重写的finalize方法，本应执行Object中的finalize*/
        Runtime r = Runtime.getRuntime();
        long max = r.maxMemory();
        long total = r.totalMemory();
        long free = r.freeMemory();
        System.out.println(max);
        System.out.println(total);
        System.out.println(free);
        System.out.println("-------------------");
        byte[] b = new byte[1000000000];
        long max2 = r.maxMemory();
        long total2 = r.totalMemory();
        long free2 = r.freeMemory();
        System.out.println(max2);
        System.out.println(total2);
        System.out.println(free2);
    }
}
