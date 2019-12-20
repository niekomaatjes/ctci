package GayleLaakmann.exercises.arraysstrings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void compress() {
        StringCompression compression = new StringCompression();
        Assert.assertEquals("a2b1c5a3",compression.compress("aabcccccaaa"));
    }
}