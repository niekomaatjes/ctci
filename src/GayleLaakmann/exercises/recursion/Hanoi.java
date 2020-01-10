package GayleLaakmann.exercises.recursion;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class Hanoi {

    void hanoi(Stack<Integer> origin, Stack<Integer> target, Stack<Integer> swap, int n, AtomicInteger moves) {
        if (n == 0) return;
        hanoi(origin, swap, target, n - 1, moves);
        target.push(origin.pop());
        moves.incrementAndGet();
        hanoi(swap, target, origin, n - 1, moves);
    }

}
