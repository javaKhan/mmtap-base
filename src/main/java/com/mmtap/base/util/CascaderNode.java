package com.mmtap.base.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/6/30.
 */
public class CascaderNode {
    private String id;
    private String value;
    private String label;
    List<CascaderNode> children = new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<CascaderNode> getChildren() {
        return children;
    }

    public void setChildren(List<CascaderNode> children) {
        this.children = children;
    }
}
