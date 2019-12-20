package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FindLoopTest {

    @Test
    void findCorruptNode_Loop_Success() {
        Node a = new Node<>(1);
        Node b = new Node<>(2);
        Node c = new Node<>(3);
        Node d = new Node<>(4);
        Node e = new Node<>(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        FindLoop loop = new FindLoop();
        Assert.assertEquals(c, loop.findCorruptNode(a));
    }

    @Test
    void findCorruptNode_NoLoop_Success() {
        Node a = new Node<>(1);
        Node b = new Node<>(2);
        Node c = new Node<>(3);
        Node d = new Node<>(4);
        Node e = new Node<>(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        FindLoop loop = new FindLoop();
        Assert.assertNull(loop.findCorruptNode(a));
    }
}