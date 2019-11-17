package com.record.thelife.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.record.thelife.mapper.UserDao;
import com.record.thelife.request.UserRequest;
import com.record.thelife.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired(required = true)
    private UserDao userMapper;

    @Override
    public void saveUser(UserRequest request) {
        userMapper.insert(request);
    }
}
