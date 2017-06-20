package com.mmtap.base.service.impl;

import com.mmtap.base.dao.UserDao;
import com.mmtap.base.model.SysUser;
import com.mmtap.base.service.BaseService;
import com.mmtap.base.service.UserService;
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
