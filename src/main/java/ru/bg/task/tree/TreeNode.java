package ru.bg.task.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private int value;
    private List<TreeNode> children;
    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
    public void addChild(TreeNode childNode) {
        this.children.add(childNode);
    }
    public int getValue() {
        return value;
    }
    public List<TreeNode> getChildNodes() {
        return children;
    }

    @Override
    public String toString() {
        return "value = " + this.value;
    }
}
