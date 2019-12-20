package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createLinkedList;

class IntersectionTest {

    @Test
    void areIntersecting_sameHead_Success() {
        Intersection intersection = new Intersection();
        Node a = createLinkedList(1, 2, 3);
        Assert.assertTrue(intersection.areIntersecting(a, a));
    }

    @Test
    void areIntersecting_intersecting_Success() {
        Intersection intersection = new Intersection();
        Node a = new Node<>(1);
        Node b = new Node<>(2);
        Node c = new Node<>(3);
        Node d = new Node<>(4);
        Node a1 = new Node<>(1);
        Node b1 = new Node<>(2);
        a.next = b;
        b.next = c;
        c.next = d;
        a1.next = b1;
        b1.next = c;
        Assert.assertTrue(intersection.areIntersecting(a, a1));
    }
}