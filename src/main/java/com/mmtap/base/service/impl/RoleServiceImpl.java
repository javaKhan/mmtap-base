package com.mmtap.base.service.impl;

import com.mmtap.base.dao.RoleDao;
import com.mmtap.base.model.SysRole;
import com.mmtap.base.service.BaseService;
import com.mmtap.base.service.RoleService;
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
