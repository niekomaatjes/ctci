package GayleLaakmann.exercises.arraysstrings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    @Test
    void isSubstring_Success() {
        StringRotation rotation = new StringRotation();
        Assert.assertTrue(rotation.isSubstring("waterbottle","erbottlewat"));
    }

    @Test
    void isSubstring_Fail() {
        StringRotation rotation = new StringRotation();
        Assert.assertFalse(rotation.isSubstring("waterbottle","banana"));
    }

    @Test
    void isSubstring_EmptySpace_Success() {
        StringRotation rotation = new StringRotation();
        Assert.assertTrue(rotation.isSubstring("water bottle","er bottlewat"));
    }
}