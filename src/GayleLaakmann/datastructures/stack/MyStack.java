package GayleLaakmann.datastructures.stack;

import GayleLaakmann.datastructures.linkedlist.Node;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private Node<T> top;

    public void push(T item) {
        Node<T> newTop = new Node<>(item);
        newTop.next = top;
        top = newTop;
    }

    public T pop() {
        if (top == null) throw new NoSuchElementException();
        T toReturn = top.val;
        top = top.next;
        return toReturn;
    }

    public T peek() {
        if (top == null) throw new NoSuchElementException();
        T toReturn = top.val;
        return toReturn;
    }

    public boolean isEmpty() {
        return (top == null);
    }

}
