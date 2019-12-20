package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;

class FindKthToLastTest {

    @Test
    void kthLast() {
        FindKthToLast findKthToLast = new FindKthToLast();
        Node linkedList = createLinkedList(1, 2, 3, 4);
        final Node kthlast = findKthToLast.kthlast(linkedList, 3);
        Assert.assertEquals(2, kthlast.val);
    }

    @Test
    void kthLast_kthIsFirst_Success() {
        FindKthToLast findKthToLast = new FindKthToLast();
        Node linkedList = createLinkedList(1, 2, 3, 4);
        final Node kthlast = findKthToLast.kthlast(linkedList, 4);
        Assert.assertEquals(1, kthlast.val);
    }

    @Test
    void kthLast_kthIsLast_Success() {
        FindKthToLast findKthToLast = new FindKthToLast();
        Node linkedList = createLinkedList(1, 2, 3, 4);
        final Node kthlast = findKthToLast.kthlast(linkedList, 1);
        Assert.assertEquals(4, kthlast.val);
    }

}