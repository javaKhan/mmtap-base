package com.mmtap.security.controller;

import com.mmtap.security.model.SysUser;
import com.mmtap.security.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * 用户控制器
 */
@RestController
public class UserController extends BaseController<SysUser,String> {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public SysUser addUser(SysUser user){
        return this.add(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam  String id){
        this.delete(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public SysUser updateUser(@RequestBody SysUser user){
        return this.updateUser(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public SysUser findById(@RequestParam String id){
        return this.find(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Page findPage(Pageable pageable){
        return this.findPage(pageable);
    }

}
