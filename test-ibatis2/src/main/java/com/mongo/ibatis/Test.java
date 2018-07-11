package com.mongo.ibatis;


import java.io.IOException;
import java.util.*;


public class Test {

    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDaoImpl();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        Map<String, Object> query = new HashMap<String, Object>();
        query.put("ids", ids);
        List<User> users = userDao.getUserByIds(query);
        System.out.println(users);
    }

}
