package com.mmtap.security.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 所有实体类的父类
 */
@MappedSuperclass
public class BaseModel implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "uuid")
    @Column(nullable = false,insertable = false,updatable = false)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, insertable = true, updatable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Timestamp createTime;


    @Column(name = "update_time", nullable = false, insertable = true, updatable = true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Timestamp updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @PrePersist
    protected void onCreate() {
        updateTime=createTime=new Timestamp((new Date()).getTime());
    }

    @PreUpdate
    protected void onUpdate() {
        updateTime =new Timestamp((new Date()).getTime());
    }
}
