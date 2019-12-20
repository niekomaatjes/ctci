package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

public class Intersection {

    boolean areIntersecting(Node headA, Node headB) {
        if (headA == null && headB == null) return false;
        if (headA == null || headB == null) return false;
        if (headA.val == headB.val && headA.next == headB.next) return true;
        return areIntersecting(headA.next, headB.next);
    }

}
