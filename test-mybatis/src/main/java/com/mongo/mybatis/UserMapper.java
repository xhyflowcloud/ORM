package com.mongo.mybatis;

import java.util.List;

public interface UserMapper {

    List<User> selectById(Integer id);
}
