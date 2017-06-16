package com.mmtap.security.service.impl;

import com.mmtap.security.dao.UserDao;
import com.mmtap.security.model.SysUser;
import com.mmtap.security.service.BaseService;
import com.mmtap.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户业务实现
 */
@Component
public class UserServiceImpl extends BaseService<SysUser,String> implements UserService {
    @Autowired
    private UserDao userDao;

}
