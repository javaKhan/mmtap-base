package com.mmtap.security.controller;


import com.mmtap.security.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * 所有控制器类的父类
 *
 * @param <T>
 * @param <ID>
 */
public class BaseController<T, ID extends Serializable> {

    @Autowired
    BaseService<T, ID> baseService;

    public T add(T t) {
        return baseService.add(t);
    }

    public void delete(ID id) {
        baseService.delete(id);
    }

    public T update(T t) {
        return baseService.update(t);
    }

    public T find(ID id) {
        return baseService.find(id);
    }

    public Iterable<T> findAll() {
        return baseService.findAll();
    }

    public Page<T> findPage(Pageable pageable) {
        return baseService.findPage(pageable);
    }

}
