package myutil.testgui.ExamSystem.util;

import myutil.testgui.ExamSystem.domain.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author LiWei
 * @date 2020/06/13 22:00
 * 该类的目的是为了增加一个缓存机制
 * 程序启动的时候将User.txt文件中的所有信息一次性读出来
 * 以后做查询直接读取缓存中的数据，提高读取性能
 */
@SuppressWarnings("all")
public class UserFileReader {
    // 创建一个集合-->充当一个缓存
    private static HashMap<String, User> userBox = new HashMap<>();

    public static User getUser(String account) {
        return userBox.get(account);
    }

    // 在当前类加载的时候先执行
    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader("src\\myutil\\testgui\\ExamSystem\\dbfile\\User.txt"));
            String user = reader.readLine();
            while (user != null) {
                String[] values = user.split("-");
                userBox.put(values[0], new User(values[0], values[1]));
                user = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
