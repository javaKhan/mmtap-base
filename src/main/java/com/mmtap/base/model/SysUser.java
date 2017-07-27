package com.mmtap.base.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 系统用户类
 */
@Entity
public class SysUser extends BaseModel{
    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String password;
    private String email;
    private String mobile;
    private String gender;
    private String comment;


    @Column(nullable = false)
    private String state;
    @ManyToOne
    @JsonIgnore
    private SysGroup group;
    @ManyToMany
    private Set<SysRole> roles = new HashSet();



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SysGroup getGroup() {
        return group;
    }

    public void setGroup(SysGroup group) {
        this.group = group;
    }

    public Set getRoles() {
        return roles;
    }

    public void setRoles(Set roles) {
        this.roles = roles;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
