package GayleLaakmann.exercises.queuesstacks;

import GayleLaakmann.datastructures.stack.MyStack;

public class StackMin<T extends Integer> extends MyStack<Integer> {

    private MyStack<Integer> min = new MyStack<>();

    @Override
    public void push(Integer item) {
        if (min.isEmpty()) {
            min.push(item);
        } else {
            Integer value = min.peek();
            if (value >= item) {
                min.push(item);
            } else {
                min.push(value);
            }
        }
        super.push(item);
    }

    @Override
    public Integer pop() {
        if (!min.isEmpty()) min.pop();
        return super.pop();
    }

    public Integer getMin() {
        return min.peek();
    }
}
