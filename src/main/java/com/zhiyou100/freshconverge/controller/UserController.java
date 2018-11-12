package com.zhiyou100.freshconverge.controller;

import com.zhiyou100.freshconverge.entry.User;
import com.zhiyou100.freshconverge.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


@Slf4j
@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "welcome!";
    }

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName, String password) {
        if (userName == null) {
            return "userName can not null";
        }

        /*if (!userService.findUser(userName)) {
            return "userName not exist,please register";
        }*/

        Optional<User> user = userService.selectByUserName(userName);
        String passwordFromSql = user.get().getPassword();
        if (password.equals(passwordFromSql)) {

            return "welcome" + userName;
        } else {
            return "password false ! please try again!";
        }
    }

}
