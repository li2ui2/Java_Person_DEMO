package cn.yubai.test;

import cn.yubai.dao.IUserDao;
import cn.yubai.dao.impl.UserDaoImpl;
import cn.yubai.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LiWei
 * @date 2020/07/12 14:53
 */
public class MybatisTest {
    /**
     * mybatis入门案例
     * */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用工厂创建dao对象
        IUserDao userDao = new UserDaoImpl(factory);
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //5.释放资源
        session.close();
        in.close();
    }
}