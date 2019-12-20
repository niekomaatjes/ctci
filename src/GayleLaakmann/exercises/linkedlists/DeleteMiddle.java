package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

import java.io.CharConversionException;

public class DeleteMiddle {

    void delete(Node n) {
        if (n == null || n.next == null) return;
        n.val = n.next.val;
        n.next = n.next.next;
    }


}
