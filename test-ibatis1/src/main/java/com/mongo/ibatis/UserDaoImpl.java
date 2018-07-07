package com.mongo.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static SqlMapClient sqlMapClient = null;
    // 读取配置文件
    static {
        try {
            Reader reader = Resources
                    .getResourceAsReader("ibatis-config.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User getUser(int id) {
        return null;
    }

    public List<User> getUserById(Integer id) {
        List<User> users = null;
        try {
            users = sqlMapClient.queryForList("selectById", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
