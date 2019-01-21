package com.etop.service;

import com.etop.dao.UserDAOV2;
import com.etop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户服务，与dao进行对接
 */
@Service("UserService")
public class UserServiceV2 implements Serializable {

    @Autowired
    private UserDAOV2 userDAO;

    /**
     * 通过用户名查找用户信息
     *
     * @param username
     * @return
     */
    public User findByName(String username) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", username);
        return userDAO.findUniqueResult("from User u where u.username = :name", params);
    }

    public List<User> getAllUser() {
        return userDAO.find("from User u");
    }
}
