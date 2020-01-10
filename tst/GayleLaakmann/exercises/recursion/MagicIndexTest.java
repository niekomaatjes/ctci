package GayleLaakmann.exercises.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MagicIndexTest {

    @Test
    void findMagicIndex() {
        MagicIndex magicIndex = new MagicIndex();
        Assert.assertEquals(3, magicIndex.findMagicIndex(new int[]{-4, -1, 0, 3, 5, 7, 8}));
        Assert.assertEquals(4, magicIndex.findMagicIndex(new int[]{-4, -1, 0, 4, 4, 7, 8}));
        Assert.assertEquals(2, magicIndex.findMagicIndex(new int[]{-4, -1, 2, 2, 3, 7, 8}));
        Assert.assertEquals(-1, magicIndex.findMagicIndex(new int[]{-4, -1, 0, 2, 3, 7, 8}));
        Assert.assertEquals(7, magicIndex.findMagicIndex(new int[]{-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13}));
    }
}