package GayleLaakmann.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void sizeToTail() {
        final Node linkedList = createLinkedList(1, 2, 3, 4);
        Assert.assertEquals(4, linkedList.sizeToTail());
        Assert.assertEquals(1,linkedList.val);
        final Node linkedList1 = createLinkedList(0);
        Assert.assertEquals(1, linkedList1.sizeToTail());
        Assert.assertEquals(0,linkedList1.val);
    }
}