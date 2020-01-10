package GayleLaakmann.exercises.recursion;

import java.util.Stack;

public class StackOfBoxes {

    int getMaxHeight(Stack<Box> boxes) {
        Stack<Box> ordered = new Stack<>();
        order(ordered, boxes);
        int height = 0;
        while (!ordered.isEmpty()) {
            height += ordered.pop().h;
        }
        return height;
    }

    private void order(Stack<Box> ordered, Stack<Box> boxes) {
        if (boxes.empty()) return;
        Box biggest = getBiggest(boxes);
        if (ordered.isEmpty()) ordered.push(biggest);
        else {
            if (biggest.compareTo(ordered.peek()) >= 0) {
                ordered.push(biggest);
            }
        }
        order(ordered, boxes);
    }

    private Box getBiggest(Stack<Box> boxes) {
        Stack<Box> temp = new Stack<>();
        Box biggest = null;
        while (!boxes.isEmpty()) {
            Box curr = boxes.pop();
            if (biggest == null) {
                biggest = curr;
                continue;
            }
            if (curr.compareTo(biggest) > 0) {
                temp.push(biggest);
                biggest = curr;
            } else {
                temp.push(curr);
            }
        }
        while (!temp.isEmpty()) {
            boxes.push(temp.pop());
        }
        return biggest;
    }

    static class Box implements Comparable<Box> {
        public int w, h, d;

        public Box(int w, int h, int d) {
            this.w = w;
            this.h = h;
            this.d = d;
        }

        @Override
        public int compareTo(Box o) {
            if (w >= o.w && h >= o.h && d >= o.d) return 1;
            if (w < o.w && h < o.h && d < o.d) return 0;
            return -1;
        }
    }
}



