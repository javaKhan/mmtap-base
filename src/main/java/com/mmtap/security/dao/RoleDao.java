package com.mmtap.security.dao;


import com.mmtap.security.model.SysRole;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<SysRole,String>{
}
