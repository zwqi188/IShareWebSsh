package com.etop.dao.Impl;

import com.etop.dao.UserDao;
import com.etop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by apple on 19/1/21.
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{

    @Autowired
    private BaseDAO baseDAO;

    @Override
    public List<User> findAll() {
        return baseDAO.find("from User u");
    }
}
