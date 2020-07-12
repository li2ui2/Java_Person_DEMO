package cn.yubai.dao;

import cn.yubai.domain.User;

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
    List<User> findAll();
}
