package myutil.teststream;
import	java.io.BufferedReader;
import	java.io.FileReader;

import java.io.*;

/**
 * @author LiWei
 * @date 2020/06/09 21:15
 */
public class TestBufferedStreamAndBufferedReader {

    // 设计一个方法，用于做用户的登录认证
    public String login(String username, String password) {
        // 真实的姓名和密码，永久的存储在数据库中---->数据持久化
        // 文件采用.txt形式的纯文本，文本中的内容以行为单位，每一行记录一个人的信息
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\user.txt"));
            String user = br.readLine();  // user表示一行记录，记录着账号密码 李伟-123456
            while (user != null) {
                // 读取user的账号密码
                String[] value = user.split("-");
                if(value[0].equals(username)) {
                    if(value[1].equals(password)) {
                        return "登录成功";
                    }
                }
                user = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "用户名或密码错误";
    }

    public static void main(String[] args) {
        /*try {
            File file = new File("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\浙江大学-硕士在读-李伟.pdf");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int a = bis.available();  // bis的其余使用方法与FileInputStream创建的fis一模一样，利用了缓存，性能比fis好

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*// 创建一个字符形式的缓冲流
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\Workspace\\Java\\jdk-11中文api修订版\\test\\aaa.txt");
            BufferedReader br = new BufferedReader(fr);
            String value = br.readLine();
            while(value != null) {
                System.out.println(value);
                value = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        TestBufferedStreamAndBufferedReader test = new TestBufferedStreamAndBufferedReader();
        String result = test.login("哈哈", "456789");
        System.out.println(result);

    }
}
