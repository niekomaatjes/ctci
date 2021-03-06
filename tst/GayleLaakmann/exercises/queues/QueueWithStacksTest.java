package GayleLaakmann.exercises.queues;

import GayleLaakmann.exercises.queuesstacks.QueueWithStacks;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class QueueWithStacksTest {

    private QueueWithStacks queue;

    @BeforeEach
    void resetQueue() {
        queue = new QueueWithStacks();
    }

    @Test
    void add_remove_FullThenEmpty_Success() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Assert.assertEquals(new Integer(1), queue.remove());
        Assert.assertEquals(new Integer(2), queue.remove());
        Assert.assertEquals(new Integer(3), queue.remove());
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    void remove_Empty_Fail() {
        Assertions.assertThrows(NoSuchElementException.class, queue::remove);
    }

    @Test
    void peek_Empty_Fail() {
        Assertions.assertThrows(NoSuchElementException.class, queue::peek);
    }

    @Test
    void peek() {
        queue.add(1);
        Assert.assertEquals(new Integer(1), queue.peek());
        Assert.assertEquals(new Integer(1), queue.peek());
    }

    @Test
    void isEmpty() {
        Assert.assertTrue(queue.isEmpty());
        queue.add(1);
        queue.remove();
        Assert.assertTrue(queue.isEmpty());
    }

}