package GayleLaakmann.datastructures.stack;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class MyStackTest {

    private MyStack<Integer> stack;

    @BeforeEach
    public void resetStack() {
        stack = new MyStack<>();
    }

    @Test
    void push_pop_FullThenEmpty_Success() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(new Integer(2), stack.pop());
        Assert.assertEquals(new Integer(1), stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    void peek() {
        stack.push(1);
        Assert.assertEquals(new Integer(1), stack.peek());
        Assert.assertEquals(new Integer(1), stack.peek());
    }

    @Test
    void peek_Empty_Fail() {
        Assertions.assertThrows(NoSuchElementException.class, () -> stack.peek());
    }

    @Test
    void isEmpty() {
        stack.push(3);
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    void isEmpty_Full_Fail() {
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
    }
}