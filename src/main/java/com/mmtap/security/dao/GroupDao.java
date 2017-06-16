package com.mmtap.security.dao;


import com.mmtap.security.model.SysGroup;
import com.mmtap.security.model.SysRole;
import org.springframework.data.repository.CrudRepository;

public interface GroupDao extends CrudRepository<SysGroup,String>{
}
