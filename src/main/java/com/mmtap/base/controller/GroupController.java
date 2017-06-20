package com.mmtap.base.controller;

import com.mmtap.base.model.SysGroup;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 组织结构控制器
 */
@RestController
public class GroupController extends BaseController<SysGroup,String>{

    @ApiOperation(value = "添加一个组织")
    @RequestMapping(value = "/group",method = RequestMethod.PUT)
    public SysGroup addGroup(@RequestBody SysGroup group){
        return this.add(group);
    }
    @ApiOperation(value = "删除一个组织")
    @ApiImplicitParam(name = "id", value = "组织ID", required = true, dataType = "String")
    @RequestMapping(value = "/group/{id}",method = RequestMethod.DELETE)
    public void deleteGroup(String id){
        this.delete(id);
    }
    @ApiOperation(value = "修改组织信息")
    @RequestMapping(value = "/group",method = RequestMethod.POST)
    public SysGroup updateGroup(@RequestBody SysGroup group){
        return this.update(group);
    }

    @ApiOperation(value = "根据ID获取一个组织")
    @ApiImplicitParam(name = "id", value = "组织ID", required = true, dataType = "String")
    @RequestMapping(value = "/group/{id}",method = RequestMethod.GET)
    public SysGroup getGroup(@PathVariable String id){
        return this.find(id);
    }

    @ApiOperation(value = "获取所有组织")
    @RequestMapping(value = "/group",method = RequestMethod.GET)
    public Object getAll(){
        return this.findAll();
    }
}
