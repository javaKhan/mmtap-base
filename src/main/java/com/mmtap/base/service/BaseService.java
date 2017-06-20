package com.mmtap.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * 所有业务类的父类
 * @param <T>
 * @param <ID>
 */
public class BaseService<T, ID extends Serializable> {
    @Autowired
    private PagingAndSortingRepository<T,ID> pagingAndSortingRepository;

    public T add(T t){
        return pagingAndSortingRepository.save(t);
    }
    public void delete(ID id){pagingAndSortingRepository.delete(id);}
    public T update(T t){return pagingAndSortingRepository.save(t);}
    public T find(ID id){return  pagingAndSortingRepository.findOne(id);}
    public Iterable<T> findAll(){return pagingAndSortingRepository.findAll();}
    public Page findPage(Pageable pageable){return pagingAndSortingRepository.findAll(pageable);
    }
}
