package GayleLaakmann.exercises.queuesstacks;

import GayleLaakmann.datastructures.stack.MyStack;

public class SortedStack extends MyStack<Integer> {

    private MyStack<Integer> temp = new MyStack<>();

    @Override
    public void push(Integer item) {
        if (super.isEmpty()) {
            super.push(item);
        } else {
            while (!super.isEmpty() && super.peek() <= item) {
                temp.push(super.pop());
            }
            super.push(item);
            while (!temp.isEmpty()) {
                super.push(temp.pop());
            }
        }
    }
}
