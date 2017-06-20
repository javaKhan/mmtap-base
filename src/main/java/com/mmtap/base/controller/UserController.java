package com.mmtap.base.controller;

import com.mmtap.base.model.SysUser;
import com.mmtap.base.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 */
@RestController
public class UserController extends BaseController<SysUser, String> {
    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "添加用户", notes = "添加一个用户", produces = "application/json")
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public SysUser addUser(@ApiParam @RequestBody SysUser user) {
        return this.add(user);
    }

    @ApiOperation(value = "删除一个用户")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        this.delete(id);
    }

    @ApiOperation(value = "修改用户")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public SysUser updateUser(@RequestBody SysUser user) {
        return this.update(user);
    }

    @ApiOperation(value = "根据ID查询用户")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public SysUser findById(@PathVariable String id) {
        return this.find(id);
    }

    @ApiOperation(value = "分页获取用户")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Page findPage(Pageable pageable) {
        return this.findPage(pageable);
    }

}
