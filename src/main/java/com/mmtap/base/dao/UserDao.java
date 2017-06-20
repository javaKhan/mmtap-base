package com.mmtap.base.dao;

import com.mmtap.base.model.SysUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by admin on 2017/6/16.
 */
public interface UserDao extends PagingAndSortingRepository<SysUser,String> {
}
