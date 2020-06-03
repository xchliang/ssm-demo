package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("info/{userId}")
    public User getUser(HttpServletRequest request, @PathVariable("userId") Long userId, String name){
        User u = userService.getUserById(userId);
        logger.info("name:"+name);
        return u;
    }
    @GetMapping("detail")
    public User getUser(HttpServletRequest request, String name){
        User u = userService.getUserByName(name);
        return u;
    }
}
