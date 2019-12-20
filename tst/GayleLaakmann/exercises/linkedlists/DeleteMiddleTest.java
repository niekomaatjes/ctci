package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.printList;

class DeleteMiddleTest {

    @Test
    void delete() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        printList(a);
        DeleteMiddle deleteMiddle = new DeleteMiddle();
        deleteMiddle.delete(b);
        Node head = a;
        Assert.assertEquals(1, head.val);
        head = head.next;
        Assert.assertEquals(3, head.val);
        head = head.next;
        Assert.assertNull(head);
        printList(a);
    }
}