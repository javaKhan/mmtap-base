package com.mmtap.base.service.impl;

import com.mmtap.base.dao.GroupDao;
import com.mmtap.base.model.SysGroup;
import com.mmtap.base.service.BaseService;
import com.mmtap.base.service.GroupService;
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
