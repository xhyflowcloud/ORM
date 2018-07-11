package com.mongo.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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

    public List<User> getUserByIds(Map<String, Object> query) {
        List<User> users = null;
        try {
            users = sqlMapClient.queryForList("selectByIds", query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public List<User> getUserByIds(List<Integer> ids) {
        List<User> users = null;
        try {
            users = sqlMapClient.queryForList("selectByIds", ids);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
