package GayleLaakmann.exercises.treesgraphs.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConvertArrayToBSTTest {

    @Test
    void convert() {
        ConvertArrayToBST convertArrayToBST = new ConvertArrayToBST();
        TreeNode root = convertArrayToBST.convert(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(4, root.data);
        TreeNode left = root.left;
        TreeNode right = root.right;
        Assert.assertEquals(2, left.data);
        Assert.assertEquals(6, right.data);
        Assert.assertEquals(1,left.left.data);
        Assert.assertNull(left.left.left);
        Assert.assertNull(left.left.right);
        Assert.assertNull(left.right.left);
        Assert.assertNull(left.right.right);
        Assert.assertEquals(3,left.right.data);
        Assert.assertEquals(5,right.left.data);
        Assert.assertEquals(7,right.right.data);
        Assert.assertNull(right.left.left);
        Assert.assertNull(right.left.right);
        Assert.assertNull(right.right.left);
        Assert.assertNull(right.right.right);

    }
}