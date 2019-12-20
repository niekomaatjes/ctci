package GayleLaakmann.exercises.treesgraphs.tree;

public class CheckIfBalanced {

    boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean left = isBalanced(root.left);
        if (!left) return false;
        boolean right = isBalanced(root.right);
        if (!right) return false;
        return Math.abs(maxHeight(root.left) - maxHeight(root.right)) <= 1;
    }

    boolean isSubTreeBalanced(TreeNode root) {
        return Math.abs(maxHeight(root) - maxHeight(root)) <= 1;
    }

    public int maxHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.max(1 + maxHeight(root.left), 1 + maxHeight(root.right));
    }

    public int minHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.min(1 + maxHeight(root.left), 1 + maxHeight(root.right));
    }

}
