package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;
import static GayleLaakmann.Utils.printArr;

class RemoveDupsTest {

    @Test
    void removeDuplicates() {
        Node head = createLinkedList(1, 1, 2, 1, 3, 4, 2, 5, 5, 2, 2, 6, 3);
        RemoveDups removeDups = new RemoveDups();
        removeDups.removeDuplicates(head); // Should now be 1 2 3 4 5 6
        Assert.assertEquals(1, head.val);
        head = head.next;
        Assert.assertEquals(2, head.val);
        head = head.next;
        Assert.assertEquals(3, head.val);
        head = head.next;
        Assert.assertEquals(4, head.val);
        head = head.next;
        Assert.assertEquals(5, head.val);
        head = head.next;
        Assert.assertEquals(6, head.val);
        head = head.next;
        Assert.assertNull(head);
    }

    @Test
    void removeDuplicates_null_Success() {
        Node head = createLinkedList();
        RemoveDups removeDups = new RemoveDups();
        removeDups.removeDuplicates(head);
        Assert.assertNull(head);
    }


    @Test
    void removeDuplicates_arrayParameter_Success() {
        RemoveDups removeDups = new RemoveDups();
        int[] arr = new int[]{1, 1, 2, 1, 3, 4, 2, 5, 5, 2, 2, 6, 3};
        arr = removeDups.removeDuplicates(arr);
        Assert.assertEquals(1,arr[0]);
        Assert.assertEquals(2,arr[1]);
        Assert.assertEquals(3,arr[2]);
        Assert.assertEquals(4,arr[3]);
        Assert.assertEquals(5,arr[4]);
        Assert.assertEquals(6,arr[5]);
    }

}