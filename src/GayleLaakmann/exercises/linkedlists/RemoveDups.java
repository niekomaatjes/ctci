package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 2.1
 * Write code to remove duplicates from an unsorted linked list.
 */
public class RemoveDups {

    public void removeDuplicates(Node head) {
        if (head == null) return;
        Node n1 = head;
        while (n1.next != null) {
            Node n2 = n1;
            while (n2.next != null) {
                if (n2.next.val == n1.val) {
                    n2.next = n2.next.next;
                } else
                    n2 = n2.next;
            }
            n1 = n1.next;
        }
    }

    public int[] removeDuplicates(int[] arr) {
        if (arr == null) return null;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        Iterator<Integer> it = set.iterator();
        int[] newArr = new int[set.size()];
        int newArrayIndex = 0;
        while (it.hasNext()) {
            newArr[newArrayIndex] = it.next();
            newArrayIndex++;
        }
        return newArr;
    }

}
