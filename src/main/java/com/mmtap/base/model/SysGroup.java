package com.mmtap.base.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * 组织结构类
 */
@Entity
public class SysGroup extends BaseModel {

    @ManyToOne
    private SysGroup parent;


    @OneToMany(mappedBy="parent",fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<SysGroup> children = new HashSet<SysGroup>(0);


    @OneToMany(mappedBy = "group",fetch = FetchType.LAZY)
//    @JsonBackReference
    private Set<SysUser> users = new HashSet();



    public Set<SysUser> getUsers() {
        return users;
    }

    public void setUsers(Set<SysUser> users) {
        this.users = users;
    }

    public SysGroup getParent() {
        return parent;
    }

    public void setParent(SysGroup parent) {
        this.parent = parent;
    }

    public Set<SysGroup> getChildren() {
        return children;
    }

    public void setChildren(Set<SysGroup> children) {
        this.children = children;
    }
}
