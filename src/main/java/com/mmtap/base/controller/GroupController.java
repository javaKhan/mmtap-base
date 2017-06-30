package com.mmtap.base.controller;

import com.mmtap.base.model.SysGroup;
import com.mmtap.base.util.BaseUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 组织结构控制器
 */
@RestController
@CrossOrigin
public class GroupController extends BaseController<SysGroup,String>{


    @ApiOperation(value = "添加一个组织")
    @RequestMapping(value = "/group",method = RequestMethod.PUT)
    public SysGroup addGroup(@RequestBody SysGroup group){
        return this.add(group);
    }
    @ApiOperation(value = "删除一个组织")
    @ApiImplicitParam(name = "id", value = "组织ID", required = true, dataType = "String")
    @RequestMapping(value = "/group/{id}",method = RequestMethod.DELETE)
    public void deleteGroup(@PathVariable String id){
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

    @ApiOperation(value = "分页获取组织")
    @RequestMapping(value = "/group",method = RequestMethod.GET)
    public Page<SysGroup> getAll(@ApiParam @PageableDefault(value = 15, sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
        return this.findPage(pageable);
    }

    @ApiOperation(value = "获取所有组织")
    @RequestMapping(value = "/groups",method = RequestMethod.GET)
    public Object getAll(){
        return this.findAll();
    }

    @ApiOperation(value = "获取树形组织")
    @RequestMapping(value = "/groups/tree",method = RequestMethod.GET)
    public List getGroupTree(){
        return BaseUtil.generateGroupTree(this.findAll());
    }

    @ApiOperation(value = "获取组织级联选择")
    @RequestMapping(value = "/groups/cascader",method = RequestMethod.GET)
    public List getGroupCascader(){
        return BaseUtil.generateGroupCascader(this.findAll());
    }

}
