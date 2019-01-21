package com.etop.dao;

import com.etop.entity.User;

import java.util.List;

/**
 * Created by apple on 19/1/21.
 */
public interface UserDao {

    List<User> findAll();
}
