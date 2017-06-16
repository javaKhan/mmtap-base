package com.mmtap.security.dao;

import com.mmtap.security.model.SysUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/16.
 */
public interface UserDao extends CrudRepository<SysUser,String> {
}
