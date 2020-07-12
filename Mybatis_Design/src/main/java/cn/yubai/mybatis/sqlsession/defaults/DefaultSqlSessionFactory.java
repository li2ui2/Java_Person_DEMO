package cn.yubai.mybatis.sqlsession.defaults;

import cn.yubai.mybatis.cfg.Configuration ;
import cn.yubai.mybatis.sqlsession.SqlSession ;
import cn.yubai.mybatis.sqlsession.SqlSessionFactory ;


/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
