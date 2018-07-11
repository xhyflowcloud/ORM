package com.mongo.ibatis;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserById(Integer id);
    List<User> getUserByIds(Map<String, Object> query);
    List<User> getUserByIds(List<Integer> ids);
}
