package com.mmtap.base.util;


import com.mmtap.base.model.SysGroup;

import java.util.ArrayList;
import java.util.List;

public class BaseUtil {
    /**
     * 使用递归方法建树
     * @param iterable
     * @return
     */
    public static List<TreeNode> generateGroupTree(Iterable<SysGroup> iterable) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        for (SysGroup group : iterable) {
            if(null==group.getParent()|| "".equals(group.getParent().getId())){
                TreeNode tn = new TreeNode();
                tn.setExpand(true);
                tn.setId(group.getId());
                tn.setTitle(group.getName());
                trees.add(findTreeChildren(tn,iterable));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param treeNode
     * @param iterable
     * @return
     */
    public static TreeNode findTreeChildren(TreeNode treeNode,Iterable<SysGroup> iterable) {
        for (SysGroup it : iterable) {
            if(null!= it.getParent() && treeNode.getId().equals(it.getParent().getId())) {
                TreeNode tn = new TreeNode();
                tn.setExpand(true);
                tn.setId(it.getId());
                tn.setTitle(it.getName());
                treeNode.getChildren().add(findTreeChildren(tn,iterable));
            }
        }
        return treeNode;
    }



    /**
     * 使用递归方法建级联选择器
     * @param iterable
     * @return
     */
    public static List<CascaderNode> generateGroupCascader(Iterable<SysGroup> iterable) {
        List<CascaderNode> cascader = new ArrayList<CascaderNode>();
        for (SysGroup group : iterable) {
            if(null==group.getParent()|| "".equals(group.getParent().getId())){
                CascaderNode cn = new CascaderNode();
                cn.setId(group.getId());
                cn.setLabel(group.getName());
                cn.setValue(group.getId());
                cascader.add(findCascaderChildren(cn,iterable));
            }
        }
        return cascader;
    }

    public static CascaderNode findCascaderChildren(CascaderNode cascaderNode,Iterable<SysGroup> iterable) {
        for (SysGroup it : iterable) {
            if(null!= it.getParent() && cascaderNode.getId().equals(it.getParent().getId())) {
                CascaderNode cn = new CascaderNode();
                cn.setId(it.getId());
                cn.setLabel(it.getName());
                cn.setValue(it.getId());
                cascaderNode.getChildren().add(findCascaderChildren(cn,iterable));
            }
        }
        return cascaderNode;
    }

}
