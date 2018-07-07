package com.mongo.ibatis;


import java.io.IOException;
import java.util.List;


public class Test {

    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.getUserById(1);
        System.out.println(users);
    }

}
