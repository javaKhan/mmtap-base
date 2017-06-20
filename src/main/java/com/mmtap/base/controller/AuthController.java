package com.mmtap.base.controller;

import com.mmtap.base.model.SysAuth;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * 权限控制器
 */
@RestController
public class AuthController extends BaseController<SysAuth,String>{

    @ApiOperation(value = "添加权限")
    @RequestMapping(value = "/auth",method = RequestMethod.PUT)
    public Object addAuth(@RequestBody SysAuth auth){
        return this.add(auth);
    }

    @ApiOperation(value = "删除权限")
    @RequestMapping(value = "/auth/{id}",method = RequestMethod.DELETE)
    public void deleteAuth(@PathVariable String id){
        this.delete(id);
    }

    @ApiOperation(value = "修改权限")
    @RequestMapping(value = "/auth",method = RequestMethod.POST)
    public Object updateAuth(@RequestBody SysAuth auth){
        return this.update(auth);
    }

    @ApiOperation(value = "根据ID获取权限")
    @RequestMapping(value = "/auth/{id}",method = RequestMethod.GET)
    public SysAuth getById(@PathVariable String id){
        return this.find(id);
    }

    @ApiOperation(value = "分页获取权限")
    @RequestMapping(value = "/auth",method = RequestMethod.GET)
    public Page<SysAuth> getAuthPage(Pageable pageable){
        return this.findPage(pageable);
    }

}
