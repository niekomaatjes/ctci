package GayleLaakmann.datastructures.queue;

import GayleLaakmann.datastructures.linkedlist.Node;

import java.util.NoSuchElementException;

public class MyQueue<T> {


    private Node<T> first = null;
    private Node<T> last = null;

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T toReturn = first.val;
        first = first.next;
        if (first == null) last = null;
        return toReturn;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.val;
    }

    public boolean isEmpty() {
        return (first == null);
    }

}
