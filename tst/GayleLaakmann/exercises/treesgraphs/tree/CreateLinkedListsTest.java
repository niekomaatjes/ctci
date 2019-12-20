package GayleLaakmann.exercises.treesgraphs.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateLinkedListsTest {

    @Test
    void createDepthLists() {
        ConvertArrayToBST convertArrayToBST = new ConvertArrayToBST();
        TreeNode root = convertArrayToBST.convert(new int[]{1,2,3,4,5,6,7});
        CreateLinkedLists createLinkedLists = new CreateLinkedLists();
        List<List<TreeNode>> depthLists = createLinkedLists.createDepthLists(root);
        Assert.assertEquals(3, depthLists.size());
        Assert.assertEquals(4, depthLists.get(0).get(0).data);
        Assert.assertEquals(2, depthLists.get(1).get(0).data);
        Assert.assertEquals(6, depthLists.get(1).get(1).data);
        Assert.assertEquals(1, depthLists.get(2).get(0).data);
        Assert.assertEquals(3, depthLists.get(2).get(1).data);
        Assert.assertEquals(5, depthLists.get(2).get(2).data);
        Assert.assertEquals(7, depthLists.get(2).get(3).data);
    }
}