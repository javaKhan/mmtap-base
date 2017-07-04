package com.mmtap.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户角色类
 */
@Entity
public class SysRole extends BaseModel{
    private String comment;

    @ManyToMany
    private Set<SysAuth> auths = new HashSet();

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<SysAuth> getAuths() {
        return auths;
    }

    public void setAuths(Set<SysAuth> auths) {
        this.auths = auths;
    }
}
