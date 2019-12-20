package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

import static GayleLaakmann.Utils.printList;

public class Palindrome {

    boolean isPalindrome(Node head) {
        int size = head.sizeToTail();
        if (size == 2) return (head.val == head.next.val);
        int offset = size / 2;
        Node headCopy = null;
        Node runner = null;
        for (int i = 0; i < offset; i++) {
            if (headCopy == null) {
                headCopy = new Node<>(head.val);
                runner = head.next;
                continue;
            }
            Node newHead = new Node<>(runner.val);
            newHead.next = headCopy;
            headCopy = newHead;
            runner = runner.next;
        }
        if (size % 2 != 0) runner = runner.next;
        while (runner != null) {
            if (runner.val != headCopy.val) return false;
            runner = runner.next;
            headCopy = headCopy.next;
        }
        return true;
    }

}
