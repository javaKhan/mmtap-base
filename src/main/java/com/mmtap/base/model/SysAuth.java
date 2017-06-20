package com.mmtap.base.model;

import javax.persistence.Entity;

/**
 * 用户权限类
 */
@Entity
public class SysAuth extends BaseModel {
    private String comment;
    private String url;
    private String pid;


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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }


}
