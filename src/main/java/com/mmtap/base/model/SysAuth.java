package com.mmtap.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * 用户权限类
 */
@Entity
public class SysAuth extends BaseModel {
    private String comment;
    private String type;
    private String url;

    @ManyToOne
    private SysAuth parent;



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SysAuth getParent() {
        return parent;
    }

    public void setParent(SysAuth parent) {
        this.parent = parent;
    }
}
