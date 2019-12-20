package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;
import static GayleLaakmann.Utils.printList;
import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    @Test
    void partition() {
        Node list = createLinkedList(3, 2, 1);
        PartitionList partitionList = new PartitionList();
        final Node partition = partitionList.partition(list, 2);
        printList(partition);
    }
}