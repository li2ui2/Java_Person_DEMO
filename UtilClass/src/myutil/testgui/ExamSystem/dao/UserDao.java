package myutil.testgui.ExamSystem.dao;

import myutil.testgui.ExamSystem.domain.User;
import myutil.testgui.ExamSystem.util.UserFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author LiWei
 * @date 2020/06/13 21:05
 * 持久层，数据的持久化
 * 只负责数据的读和写，不负责处理逻辑
 * 现阶段看到的方法内同 冗长都是包含了I/O
 * 以后这个层次的方法看到的内部代码都是JDBC
 */
public class UserDao {

    // 缓存--虚拟机(内存中)--存储用户文件中的所有信息


    // 负责查询一个人的信息
    public User selectOne(String account) {
        return UserFileReader.getUser(account);
    }

}
