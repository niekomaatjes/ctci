package GayleLaakmann.exercises.queuesstacks;

import GayleLaakmann.datastructures.stack.MyStack;

import java.util.NoSuchElementException;

public class QueueWithStacks {

    MyStack<Integer> first = new MyStack<>();
    MyStack<Integer> second = new MyStack<>();

    public void add(Integer item) {
        second.push(item);
    }

    public Integer remove() {
        if (first.isEmpty() && second.isEmpty()) throw new NoSuchElementException();
        if (first.isEmpty()) {
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }
        return first.pop();
    }

    public Integer peek() {
        if (first.isEmpty() && second.isEmpty()) throw new NoSuchElementException();
        if (first.isEmpty()) {
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }
        return first.peek();
    }

    public boolean isEmpty(){
        return (first.isEmpty() && second.isEmpty());
    }

}
