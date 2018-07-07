package com.mongo.ibatis;

import java.util.List;

public interface UserDao {
    List<User> getUserById(Integer id);
}
