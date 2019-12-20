package GayleLaakmann.exercises.treesgraphs.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ValidateBSTTest {

    @Test
    void validate() {
    }

    @Test
    void validateBST() {

        ConvertArrayToBST convertArrayToBST = new ConvertArrayToBST();
        TreeNode convert = convertArrayToBST.convert(new int[]{1, 2, 3});
        ValidateBST validateBST = new ValidateBST();
        Assert.assertTrue(validateBST.validateBST(convert));

    }
}