package com.mmtap.base.util;

import java.util.ArrayList;
import java.util.List;


public class TreeNode {
    private String id;
    private boolean expand;
    private String  title;
    private List children = new ArrayList();

    public void addChild(TreeNode treeNode){
        children.add(treeNode);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }
}
