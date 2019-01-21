package com.etop.dao;

import com.etop.dao.Impl.BaseDAO;
import com.etop.entity.User;
import org.springframework.stereotype.Repository;

@Repository("UserDAO")
public class UserDAOV2 extends BaseDAO<User> {
}
