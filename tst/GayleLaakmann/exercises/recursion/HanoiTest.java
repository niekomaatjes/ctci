package GayleLaakmann.exercises.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

class HanoiTest {

    @Test
    void hanoi() {
        Stack<Integer> origin = new Stack<>();
        Stack<Integer> target = new Stack<>();
        Stack<Integer> swap = new Stack<>();
        AtomicInteger moves = new AtomicInteger();
        origin.push(3);
        origin.push(2);
        origin.push(1);
        Hanoi hanoi = new Hanoi();
        hanoi.hanoi(origin, target, swap, origin.size(), moves);
        Assert.assertEquals(7, moves.get());
        Assert.assertEquals(1, target.pop().intValue());
        Assert.assertEquals(2, target.pop().intValue());
        Assert.assertEquals(3, target.pop().intValue());
        Assert.assertEquals(0, origin.size());
        Assert.assertEquals(0, swap.size());
    }
}