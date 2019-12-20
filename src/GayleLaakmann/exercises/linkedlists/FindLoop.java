package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

public class FindLoop {

    Node findCorruptNode(Node head) {
        Node slow = head.next;
        Node fast = head.next.next;
        while (slow.val != fast.val) {
            slow = slow.next;
            if (slow == null) return null;
            fast = fast.next;
            if (fast == null) return null;
            fast = fast.next;
            if (fast == null) return null;
        }
        slow = head;
        while (slow.val != fast.val) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
