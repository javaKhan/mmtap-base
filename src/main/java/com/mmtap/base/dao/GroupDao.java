package com.mmtap.base.dao;


import com.mmtap.base.model.SysGroup;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupDao extends PagingAndSortingRepository<SysGroup,String> {
}
