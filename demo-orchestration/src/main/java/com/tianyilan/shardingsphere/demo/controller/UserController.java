package com.tianyilan.shardingsphere.demo.controller;

import com.tianyilan.shardingsphere.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Description: 保存用户
     */
    @PostMapping("save-user")
    public void saveUser() throws Exception {
        userService.processUsers();
    }
    @GetMapping("list-user")
    public Object listUsers() throws SQLException {
       return userService.getUsers();
    }
}