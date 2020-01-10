package GayleLaakmann.exercises.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RecursiveMultiplyTest {

    @Test
    void multiply() {
        RecursiveMultiply recursiveMultiply = new RecursiveMultiply();
        Assert.assertEquals(4, recursiveMultiply.multiply(2, 2));
        Assert.assertEquals(-4, recursiveMultiply.multiply(-2, 2));
        Assert.assertEquals(0, recursiveMultiply.multiply(0, 2));
        Assert.assertEquals(0, recursiveMultiply.multiply(2, 0));
        Assert.assertEquals(4, recursiveMultiply.multiply(-2, -2));
        Assert.assertEquals(2, recursiveMultiply.multiply(2, 1));
    }
}