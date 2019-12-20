package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

public class SumLists {

    Node sumReversed(Node<Integer> a, Node<Integer> b, int carry) {
        if (a == null && b == null) {
            if (carry > 0)
                return new Node<>(carry);
            else return null;
        }
        int aValue = (a == null ? 0 : a.val);
        int bValue = (b == null ? 0 : b.val);
        int actualSum = aValue + bValue + carry;
        int sum = actualSum % 10;
        int currentCarry = actualSum / 10;
        Node head = new Node<>(sum);
        head.next = sumReversed(a.next, b.next, currentCarry);
        return head;
    }

    Node sum(Node<Integer> a, Node<Integer> b, Carry c) {
        if (a == null && b == null) {
            return null;
        }
        Node nextSum = sum(a.next, b.next, c);
        int aValue = (a == null ? 0 : a.val);
        int bValue = (b == null ? 0 : b.val);
        int actualSum = aValue + bValue + c.carry;
        int sum = actualSum % 10;
        c.carry = actualSum / 10;
        Node head = new Node<>(sum);
        head.next = nextSum;
        return head;
    }

    Node sum(Node<Integer> a, Node<Integer> b) {
        Carry c = new Carry();
        Node sum = sum(a, b, c);
        if (c.carry != 0) {
            Node n = new Node<>(c.carry);
            n.next = sum;
            return n;
        }
        return sum;

    }

    class Carry {
        int carry = 0;
    }

}
