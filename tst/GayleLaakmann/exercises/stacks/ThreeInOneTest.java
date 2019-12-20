package GayleLaakmann.exercises.stacks;

import GayleLaakmann.exercises.queuesstacks.ThreeInOne;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class ThreeInOneTest {

    private ThreeInOne threeInOne;

    @BeforeEach
    void resetStack() {
        threeInOne = new ThreeInOne();
    }

    @Test
    void push_pop_Success() {
        Assert.assertTrue(threeInOne.isEmpty(0));
        Assert.assertTrue(threeInOne.isEmpty(1));
        Assert.assertTrue(threeInOne.isEmpty(2));
        threeInOne.push(0, 1);
        threeInOne.push(1, 2);
        threeInOne.push(2, 3);
        Assert.assertEquals(1, threeInOne.pop(0));
        Assert.assertEquals(2, threeInOne.pop(1));
        Assert.assertEquals(3, threeInOne.pop(2));
        Assert.assertTrue(threeInOne.isEmpty(0));
        Assert.assertTrue(threeInOne.isEmpty(1));
        Assert.assertTrue(threeInOne.isEmpty(2));
    }

    @Test
    void peek() {
        threeInOne.push(0, 1);
        threeInOne.push(1, 2);
        threeInOne.push(2, 3);
        Assert.assertEquals(1, threeInOne.peek(0));
        Assert.assertEquals(2, threeInOne.peek(1));
        Assert.assertEquals(3, threeInOne.peek(2));
        Assert.assertFalse(threeInOne.isEmpty(0));
        Assert.assertFalse(threeInOne.isEmpty(1));
        Assert.assertFalse(threeInOne.isEmpty(2));
        Assert.assertEquals(1, threeInOne.peek(0));
        Assert.assertEquals(2, threeInOne.peek(1));
        Assert.assertEquals(3, threeInOne.peek(2));
    }


    @Test
    void peek_Empty_Fail() {
        Assertions.assertThrows(NoSuchElementException.class, () -> threeInOne.peek(0));
        Assertions.assertThrows(NoSuchElementException.class, () -> threeInOne.peek(1));
        Assertions.assertThrows(NoSuchElementException.class, () -> threeInOne.peek(2));
    }

    @Test
    void pop_IllegalPosition_Fail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.pop(5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.pop(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.pop(3));
    }


    @Test
    void empty_IllegalPosition_Fail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.isEmpty(5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.isEmpty(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.isEmpty(3));
    }

    @Test
    void push_IllegalPosition_Fail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.push(5, 1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.push(-1, 2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> threeInOne.push(3, 4));
    }

}