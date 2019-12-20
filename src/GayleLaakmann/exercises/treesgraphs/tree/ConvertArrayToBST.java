package GayleLaakmann.exercises.treesgraphs.tree;

public class ConvertArrayToBST {

    public TreeNode convert(int[] arr) {
        return convertRecurse(arr, 0, arr.length - 1);
    }

    private TreeNode convertRecurse(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = convertRecurse(arr, start, mid - 1);
        root.right = convertRecurse(arr, mid + 1, end);
        return root;
    }

}
