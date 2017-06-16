package com.mmtap.security.service.impl;

import com.mmtap.security.dao.AuthDao;
import com.mmtap.security.model.SysAuth;
import com.mmtap.security.service.AuthService;
import com.mmtap.security.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 权限业务实现
 */
@Component
public class AuthServiceImpl extends BaseService<SysAuth,String> implements AuthService {
    @Autowired
    private AuthDao authDao;
}
