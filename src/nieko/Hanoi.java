package nieko;


import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classic recursion problem. Let's try to reduce this problem to the most simples form.
 * So we have three pillars A, B, C, we have to move everything to pillar C.
 * If n = 1, the solution is straight forward, we do a move A -> C.
 * If n = 2, we can observe that the solution to moving a disk from pillar A to C, can only be done
 * when the disk underneath ( n = 1 ) is moved to B first. Once those conditions are met we can do a move from
 * A -> C, but then we also have to do a move from B -> C again. At this point, we can observe that the origin and
 * destination pillars are abstract, because they might change during the runtime of the algorithm, so it might be a
 * good time to rename A, B, C to, origin, swap, target. It's safe to assume that before moving a disk n from it's origin to it's target,
 * we must recursively solve n - 1 first. Let's go back to n = 2.
 * n = 2 -->
 * move n = 1 from A (origin) to  B (swap)
 * move n = 2 from A (origin) to C (target)
 * move n = 1  from B (swap) to C (target)
 * so as we can se, we've made out the algorithm for our problem, and by induction it works for n where n is {1, 2... n};
 * Now the specifics of the underlying problem are different in the sense that they do not print the moves, but just
 * the number of moves. The algorithm is the same.
 */
public class Hanoi {

    void hanoi(Stack<Integer> origin, Stack<Integer> target, Stack<Integer> swap, int n, AtomicInteger moves) {
        if (n == 0) return;
        hanoi(origin, swap, target, n - 1, moves);
        target.push(origin.pop());
        moves.incrementAndGet();
        hanoi(swap, target, origin, n - 1, moves);
    }

}
