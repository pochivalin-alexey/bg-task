package ru.bg.task.tree;

import org.junit.jupiter.api.Test;
import ru.bg.task.TestUtilsGenerator;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeUtilsTest {
    private final TreeUtils treeUtils = new TreeUtils();
    @Test
    public void searchTreeNodeWhenValueGreaterThanTest() {
        TreeNode root = TestUtilsGenerator.generateTreeNode();
        List<TreeNode> result = treeUtils.searchTreeNodeWhenValueGreaterThan(root, 5, new ArrayList<>());
        assertEquals(4, result.size());
        assertEquals(7, result.get(0).getValue());
        assertEquals(28, result.get(1).getValue());
        assertEquals(18, result.get(2).getValue());
        assertEquals(26, result.get(3).getValue());
    }

    @Test
    public void searchTreeNodeWhenValueGreaterThanEmptyTest() {
        TreeNode root = TestUtilsGenerator.generateTreeNode();
        List<TreeNode> result = treeUtils.searchTreeNodeWhenValueGreaterThan(root, 100, new ArrayList<>());
        assertEquals(0, result.size());
    }

    @Test
    public void searchTreeNodeWhenValueGreaterThanNullTest() {
        TreeNode root = null;
        List<TreeNode> result = treeUtils.searchTreeNodeWhenValueGreaterThan(root, 100, new ArrayList<>());
        assertEquals(0, result.size());
    }
}