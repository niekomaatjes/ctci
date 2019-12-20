package GoogleTechDev.iteratorofiterators;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

class GenericWeavedIteratorTest {

    GenericWeavedIterator iterator;
    Integer[] arr1 = new Integer[]{1, 2, 3};
    Integer[] arr2 = new Integer[]{4, 5};
    Integer[] arr3 = new Integer[]{6, 7, 8, 9};
    Integer[] arr4 = new Integer[]{};
    Iterator<Integer> a = Arrays.asList(arr1).iterator();
    Iterator<Integer> b = Arrays.asList(arr2).iterator();
    Iterator<Integer> c = Arrays.asList(arr3).iterator();
    Iterator<Integer> d = Arrays.asList(arr4).iterator();

    @Test
    void next_Full_Success() {
        iterator = new GenericWeavedIterator(a, b, c);
        Assert.assertEquals(1, iterator.next());
        Assert.assertEquals(4, iterator.next());
        Assert.assertEquals(6, iterator.next());
        Assert.assertEquals(2, iterator.next());
        Assert.assertEquals(5, iterator.next());
        Assert.assertEquals(7, iterator.next());
        Assert.assertEquals(3, iterator.next());
        Assert.assertEquals(8, iterator.next());
        Assert.assertEquals(9, iterator.next());
    }

    @Test
    void next_EmptyIteratorArgument_Success() {
        iterator = new GenericWeavedIterator(a, d, c);
        Assert.assertEquals(1, iterator.next());
        Assert.assertEquals(6, iterator.next());
        Assert.assertEquals(2, iterator.next());
        Assert.assertEquals(7, iterator.next());
        Assert.assertEquals(3, iterator.next());
        Assert.assertEquals(8, iterator.next());
        Assert.assertEquals(9, iterator.next());
    }

    @Test
    void hasNext_NotEmpty_Success() {
        iterator = new GenericWeavedIterator(a, b, c);
        Assert.assertTrue(iterator.hasNext());
    }


    @Test
    void hasNext_Empty_Success() {
        iterator = new GenericWeavedIterator();
        Assert.assertFalse(iterator.hasNext());
    }
}