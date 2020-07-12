package cn.yubai.dao.impl;

import cn.yubai.dao.IUserDao;
import cn.yubai.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author LiWei
 * @date 2020/07/12 21:46
 */
public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory  factory){
        this.factory = factory;
    }


    @Override
    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("cn.yubai.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return users;
    }
}
