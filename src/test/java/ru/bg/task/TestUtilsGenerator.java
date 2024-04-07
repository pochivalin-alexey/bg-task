package ru.bg.task;

import ru.bg.task.circle.Circle;
import ru.bg.task.circle.Point;
import ru.bg.task.tree.TreeNode;

public class TestUtilsGenerator {
    public static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(5);
        TreeNode child11 = new TreeNode(7);
        TreeNode child12 = new TreeNode(18);
        TreeNode child21 = new TreeNode(28);
        TreeNode child22 = new TreeNode(26);

        root.addChild(child11);
        root.addChild(child12);
        child11.addChild(child21);
        child12.addChild(child22);
        return root;
    }

    public static Circle generateCircle(double x, double y, int d) {
        Point center = new Point(x,y);
        return new Circle(center, d);
    }
}
