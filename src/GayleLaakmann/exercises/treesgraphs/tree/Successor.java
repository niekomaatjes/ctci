package GayleLaakmann.exercises.treesgraphs.tree;

public class Successor {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode k) {
        return findSuccessor(root, k, null);
    }

    public TreeNode findSuccessor(TreeNode root, TreeNode k, TreeNode next) {
        if (root == null) return null;
        if (root == k) return next;
        TreeNode left = findSuccessor(root.left, k, root);
        if (left != null) return left;
        return findSuccessor(root.right, k, next);
    }
}
