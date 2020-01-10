package GayleLaakmann.exercises.recursion;

import GayleLaakmann.exercises.recursion.StackOfBoxes.Box;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class StackOfBoxesTest {

    @Test
    void getMaxHeight() {
        StackOfBoxes boxes = new StackOfBoxes();
        Stack<Box> stack = new Stack<>();
        stack.push(new Box(3, 3, 3));
        stack.push(new Box(1, 1, 1));
        stack.push(new Box(2, 2, 2));
        Assert.assertEquals(6, boxes.getMaxHeight(stack));
    }

    @Test
    void getMaxHeight_IrregularBoxes_Success() {
        StackOfBoxes boxes = new StackOfBoxes();
        Stack<Box> stack = new Stack<>();
        stack.push(new Box(3, 3, 3));
        stack.push(new Box(1, 5, 1));
        stack.push(new Box(2, 2, 2));
        stack.push(new Box(7, 8, 9));
        stack.push(new Box(6, 6, 6));
        stack.push(new Box(13, 1, 5));
        stack.push(new Box(3, 3, 3));
        stack.push(new Box(3, 5, 1));
        stack.push(new Box(5, 4, 3));
        Assert.assertEquals(20, boxes.getMaxHeight(stack));
    }
}