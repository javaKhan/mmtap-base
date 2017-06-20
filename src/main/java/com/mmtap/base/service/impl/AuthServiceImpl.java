package com.mmtap.base.service.impl;

import com.mmtap.base.dao.AuthDao;
import com.mmtap.base.model.SysAuth;
import com.mmtap.base.service.AuthService;
import com.mmtap.base.service.BaseService;
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
