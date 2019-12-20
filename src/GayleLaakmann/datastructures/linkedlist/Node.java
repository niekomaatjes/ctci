package GayleLaakmann.datastructures.linkedlist;

public class Node<E> {

    public Node<E> next;
    public E val;

    public Node(E val) {
        this.val = val;
    }

    public int sizeToTail() {
        Node runner = this;
        int size = 0;
        while (runner != null) {
            size++;
            runner = runner.next;
        }
        return size;
    }

}
