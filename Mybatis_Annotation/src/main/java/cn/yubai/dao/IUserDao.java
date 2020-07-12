package cn.yubai.dao;

import cn.yubai.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LiWei
 * @date 2020/07/12 14:12
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
