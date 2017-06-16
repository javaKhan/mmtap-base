package com.mmtap.security.service.impl;

import com.mmtap.security.dao.GroupDao;
import com.mmtap.security.model.SysGroup;
import com.mmtap.security.service.BaseService;
import com.mmtap.security.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 组织结构业务实现
 */
@Component
public class GroupServiceImpl extends BaseService<SysGroup,String> implements GroupService {
    @Autowired
    private GroupDao groupDao;
}
