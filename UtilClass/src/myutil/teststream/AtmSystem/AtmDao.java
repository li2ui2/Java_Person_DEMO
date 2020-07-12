package myutil.teststream.AtmSystem;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author LiWei
 * @date 2020/06/10 14:56
 */
public class AtmDao {
    // DAO作为一个层次---持久层，操作数据，负责读写数据
    // Data Access Object
    // DAO小弟负责加载文件和更新文件数据
    private final FileloaderAndCommit flac =
            new FileloaderAndCommit("src\\myutil\\teststream\\AtmSystem\\User.txt");

    // 登录方法每一次调用都需要调用流管道，进行读取文件信息
    // 内存中操作登录的业务，文件不在一个地方，读取速度会很慢
    // 因此可以创建一个map集合充当缓存，将文件中的数据全都读出来，读一次
    // 将User.txt中的一行记录 创建一个对象存起来
    // 集合除了可以充当缓存，增强执行性能意外，还能用来做记录的修改
    private final HashMap<String, User> userBox = flac.loadFile();


    // 设计一个方法，目的是为了所有业务尽心服务
    public User selectUser(String name) {
        return userBox.get(name);
    }

    // 设计一个方法，目的是为了将某一个修改完毕的对象存入集合
    public void updateUser(User user) {
        userBox.put(user.getName(), user);  // 集合做了修改
        flac.commit(userBox);
    }
}
