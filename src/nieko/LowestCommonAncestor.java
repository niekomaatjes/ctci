package nieko;

import GayleLaakmann.exercises.treesgraphs.tree.TreeNode;

/**
 * As seen at https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 *
 * According to the definition of LCA on
 * Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in
 * T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 *
 * So if we start traversing the tree and find at node n either p or q, we return n and there is no need to traverse further.
 * Because :
 * 1) We return into a call stack near the root of the tree, so n will be either the left side or right side of a parent node p.
 * At which point we have to check if both left sides and right sides are valid, then p is going to be the LCA of the nodes p and q.
 * If not, than we just return left or right if they are valid, otherwise null.
 * 2) If p and q are descendants, than the value n is going to bubble up to the root, but that will not prevent the algorithm to continue
 * on the other side of the tree.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return (left == null ? right : left);
    }
}
