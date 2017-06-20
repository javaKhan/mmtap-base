package com.mmtap.base.dao;


import com.mmtap.base.model.SysAuth;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthDao extends PagingAndSortingRepository<SysAuth,String> {
}
