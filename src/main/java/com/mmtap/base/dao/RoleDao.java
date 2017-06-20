package com.mmtap.base.dao;


import com.mmtap.base.model.SysRole;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleDao extends PagingAndSortingRepository<SysRole,String> {
}
