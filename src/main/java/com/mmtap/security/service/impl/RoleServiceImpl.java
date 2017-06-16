package com.mmtap.security.service.impl;

import com.mmtap.security.dao.RoleDao;
import com.mmtap.security.model.SysRole;
import com.mmtap.security.service.BaseService;
import com.mmtap.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 角色业务实现
 */
@Component
public class RoleServiceImpl extends BaseService<SysRole,String> implements RoleService {
    @Autowired
    private RoleDao roleDao;
}
