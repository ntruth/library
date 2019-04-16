package com.ucmed.library.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ucmed.library.model.User;
import com.ucmed.library.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "学生模块")
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获取所有学生列表")
    @GetMapping("/list")
    public PageInfo listUser(){
        PageHelper.startPage(1, 15);
        List<User> users = userService.listUser();
        PageInfo pageInfo = new PageInfo(users, 5);
        return pageInfo;
    }
}
