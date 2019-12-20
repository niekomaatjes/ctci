package GayleLaakmann.exercises.stacks;

import GayleLaakmann.exercises.queuesstacks.SortedStack;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortedStackTest {

    @Test
    void push() {
        SortedStack sortedStack = new SortedStack();
        sortedStack.push(2);
        sortedStack.push(3);
        sortedStack.push(6);
        sortedStack.push(7);
        Assert.assertEquals(new Integer(2), sortedStack.pop());
        Assert.assertEquals(new Integer(3), sortedStack.pop());
        Assert.assertEquals(new Integer(6), sortedStack.pop());
        Assert.assertEquals(new Integer(7), sortedStack.pop());

    }
}