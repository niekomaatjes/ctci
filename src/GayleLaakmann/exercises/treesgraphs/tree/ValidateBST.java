package GayleLaakmann.exercises.treesgraphs.tree;

import java.util.LinkedList;
import java.util.List;

public class ValidateBST {

    public boolean validate(TreeNode root) {
        if (root == null) return true;
        boolean left = validate(root.left);
        if (!left) return false;
        boolean right = validate(root.right);
        if (!right) return false;
        TreeNode max = findMax(root.left);
        TreeNode min = findMin(root.right);
        return (max.data >= root.data && min.data < root.data);
    }

    private TreeNode findMax(TreeNode root) {
        if (root == null) return null;
        TreeNode max = root;
        TreeNode left = findMax(root.left);
        if (left != null && left.data >= max.data) max = left;
        TreeNode right = findMax(root.right);
        if (right != null && right.data > root.data) max = right;
        return max;
    }

    private TreeNode findMin(TreeNode root) {
        if (root == null) return null;
        TreeNode min = root;
        TreeNode left = findMax(root.left);
        if (left != null && left.data < min.data) min = left;
        TreeNode right = findMax(root.right);
        if (right != null && right.data < root.data) min = right;
        return min;
    }

    public boolean validateBST(TreeNode node) {
        List<TreeNode> inOrder = new LinkedList<>();
        inorderConversion(node, inOrder);
        int min = 0;
        for (TreeNode n : inOrder) {
            if (n.data < min) return false;
            min = n.data;
        }
        return true;
    }

    private void inorderConversion(TreeNode node, List<TreeNode> inOrder) {
        if (node == null) return;
        inorderConversion(node.left, inOrder);
        inOrder.add(node);
        inorderConversion(node.right, inOrder);
    }
}
