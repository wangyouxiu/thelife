package com.thelife.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.record.dao.UserDao;
import com.thelife.request.UserRequest;
import com.thelife.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userMapper;

    @Override
    public void saveUser(UserRequest request) {
        userMapper.insert(request);
    }
}
