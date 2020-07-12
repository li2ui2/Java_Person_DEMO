import java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/05/27 11:32
 */
public class TestScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // input会在计算机中的消息队列内等着读取数据
        // nextInt不会读取队列中的回车，只获取回车之前的数据，直到遇见回车，退出。
        // nextLine会读取回车，读到回车后，退出。
        System.out.println("请输入密码：");
        String value = input.nextLine();
        int password = Integer.parseInt(value);
        // 由于密码为数字
        // 1.利用nextLine方法读取一个空回车
        // Int password = input.nextInt();
        // input.nextLine();
        // 2.利用next方法读取字符串，next方法读取方式与nextInt一样，不读取回车
        System.out.println("请输入账号：");
        String name = input.nextLine();

        System.out.println("读到了账号名" + name);
        System.out.println("读到了密码" + password);
    }
}
