package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;
import static GayleLaakmann.Utils.printList;

class SumListsTest {

    @Test
    void sumList_reversed() {
        SumLists sumLists = new SumLists();
        Node aList = createLinkedList(7, 1, 6);
        Node bList = createLinkedList(5, 9, 2);
        Node sum = sumLists.sumReversed(aList, bList, 0);
        printList(sum);
        Assert.assertEquals(2, sum.val);
        sum = sum.next;
        Assert.assertEquals(1, sum.val);
        sum = sum.next;
        Assert.assertEquals(9, sum.val);
    }

    @Test
    void sumList() {
        SumLists sumLists = new SumLists();
        Node aList = createLinkedList(6, 1, 7);
        Node bList = createLinkedList(2, 9, 5);
        Node sum = sumLists.sum(aList, bList);
        printList(sum);
        Assert.assertEquals(9, sum.val);
        sum = sum.next;
        Assert.assertEquals(1, sum.val);
        sum = sum.next;
        Assert.assertEquals(2, sum.val);
    }

    @Test
    void sumList_carry() {
        SumLists sumLists = new SumLists();
        Node aList = createLinkedList(8, 1, 7);
        Node bList = createLinkedList(2, 9, 5);
        Node sum = sumLists.sum(aList, bList);
        printList(sum);
        Assert.assertEquals(1, sum.val);
        sum = sum.next;
        Assert.assertEquals(1, sum.val);
        sum = sum.next;
        Assert.assertEquals(1, sum.val);
        sum = sum.next;
        Assert.assertEquals(2, sum.val);
    }

}