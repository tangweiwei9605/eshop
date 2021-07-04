package com.shu.eshop.user.service.impl;


import com.shu.eshop.user.mapper.UserMapper;
import com.shu.eshop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

}
