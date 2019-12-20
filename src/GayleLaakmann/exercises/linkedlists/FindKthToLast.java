package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

public class FindKthToLast {

    Node kthlast(Node head, int k) {
        Node n = head;
        Node runner = n;
        int i = 1;
        while (i < k) {
            i++;
            runner = runner.next;
        }
        while (runner.next != null) {
            n = n.next;
            runner = runner.next;
        }
        return n;
    }

}
