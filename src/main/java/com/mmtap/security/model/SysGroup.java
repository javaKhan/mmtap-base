package com.mmtap.security.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * 组织结构类
 */
@Entity
public class SysGroup extends BaseModel {
    private String pid;
    @OneToMany(mappedBy = "group")
    private Set<SysUser> users = new HashSet();


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Set<SysUser> getUsers() {
        return users;
    }

    public void setUsers(Set<SysUser> users) {
        this.users = users;
    }
}
