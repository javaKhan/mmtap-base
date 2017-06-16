package com.mmtap.security.dao;


import com.mmtap.security.model.SysAuth;
import com.mmtap.security.model.SysRole;
import org.springframework.data.repository.CrudRepository;

public interface AuthDao extends CrudRepository<SysAuth,String>{
}
