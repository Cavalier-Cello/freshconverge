package com.zhiyou100.freshconverge.service;

import com.zhiyou100.freshconverge.dao.UserRepository;
import com.zhiyou100.freshconverge.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userDao;


    public Optional<User> selectByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    /*public boolean findUser(String userName) {
        if (userDao.findUser(userName)) {
            return true;
        }
        return false;
    }*/
}
