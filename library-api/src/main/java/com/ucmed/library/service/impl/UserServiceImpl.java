package com.ucmed.library.service.impl;

import com.github.pagehelper.PageInfo;
import com.ucmed.library.mapper.UserMapper;
import com.ucmed.library.model.User;
import com.ucmed.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {

        return userMapper.selectAll();
    }
}
