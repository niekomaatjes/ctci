package GayleLaakmann.exercises.stacks;

import GayleLaakmann.exercises.queuesstacks.StackMin;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackMinTest {

    @Test
    void getMin() {
        StackMin<Integer> min = new StackMin<>();
        min.push(7);
        Assert.assertEquals(new Integer(7),min.getMin());
        min.push(5);
        Assert.assertEquals(new Integer(5),min.getMin());
        min.push(3);
        Assert.assertEquals(new Integer(3),min.getMin());
        min.pop();
        Assert.assertEquals(new Integer(5),min.getMin());
        min.pop();
        Assert.assertEquals(new Integer(7),min.getMin());

    }
}