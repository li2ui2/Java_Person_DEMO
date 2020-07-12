package myutil.teststream.AtmSystem;
import	java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/06/10 15:43
 */
public class Test {
    public static void main(String[] args) {
        AtmService service = new AtmService();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎您使用银行资助服务系统\n请输入账号：");
        String name = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();
        String loginResult = service.login(name, password);
        if(loginResult.equals("登录成功")) {
            System.out.println("恭喜您登录成功，请输入您操作项：");
            System.out.println("查询请输入1\n存款请输入2\n取款请输入3\n转账请输入4\n退出请输入5");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    Float balance = service.queryBalance(name);
                    System.out.println("尊敬的" + name + "用户，您的可用余额为"+ balance);
                    break;
                default:
                    break;
            }
        }else {
            System.out.println("对不起，" + loginResult);
        }
    }
}
