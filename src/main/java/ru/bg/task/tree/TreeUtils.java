package ru.bg.task.tree;

import java.util.List;

public class TreeUtils {
    /**
    * Поиск узлов дерева, значения которых больше чем заданное
    * @param root - корень дерева
    * @param n - значение для фильрации
    * @return result - узлы дерева, значения которых больше n
    */
    public List<TreeNode> searchTreeNodeWhenValueGreaterThan(TreeNode root, int n, List<TreeNode> result) {
        if (root == null) return result;
        for (TreeNode child : root.getChildNodes()) {
            if (child.getValue() > n) {
                result.add(child);
            }
            searchTreeNodeWhenValueGreaterThan(child, n, result);
        }
        return result;
    }
}
