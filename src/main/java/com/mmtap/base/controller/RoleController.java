package com.mmtap.base.controller;

import com.mmtap.base.model.SysRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * 角色控制器
 */
@RestController
@CrossOrigin
public class RoleController extends BaseController<SysRole,String> {
    @ApiOperation(value = "添加角色")
    @RequestMapping(value = "/role",method = RequestMethod.PUT)
    public SysRole addRole(@ApiParam @RequestBody SysRole role){
        return this.add(role);
    }

    @ApiOperation(value = "删除角色")
    @RequestMapping(value = "/role/{id}",method = RequestMethod.DELETE)
    public void deleteRole(@ApiParam @PathVariable String id){
        this.delete(id);
    }

    @ApiOperation(value = "修改角色")
    @RequestMapping(value = "/role",method = RequestMethod.POST)
    public SysRole updateRole(@ApiParam @RequestBody SysRole role){
       return this.update(role);
    }
    @ApiOperation(value = "根据ID获取角色")
    @RequestMapping(value = "/role/{id}",method = RequestMethod.GET)
    public SysRole getRole(@PathVariable String id){
        return find(id);
    }
    @ApiOperation(value = "分页获取角色")
    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public Page<SysRole> getRolePage(@ApiParam Pageable pageable){
        return this.findPage(pageable);
    }
}
