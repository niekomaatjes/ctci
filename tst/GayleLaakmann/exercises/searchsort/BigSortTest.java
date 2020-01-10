package GayleLaakmann.exercises.searchsort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BigSortTest {

    @Test
    void sort_Decreasing_Success() {
        BigSort sort = new BigSort();
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        sort.sort(list);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
    }

    @Test
    void sort_Random_Success() {
        BigSort sort = new BigSort();
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("a");
        sort.sort(list);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
        Assert.assertEquals("d",list.get(3));
        Assert.assertEquals("e",list.get(4));
    }

    @Test
    void sort_FirstBiggestRestIncreasing_Success() {
        BigSort sort = new BigSort();
        List<String> list = new ArrayList<>();
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        sort.sort(list);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
        Assert.assertEquals("d",list.get(3));
        Assert.assertEquals("e",list.get(4));
    }

    @Test
    void sort_Increasing_Success() {
        BigSort sort = new BigSort();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        sort.sort(list);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
        Assert.assertEquals("d",list.get(3));
        Assert.assertEquals("e",list.get(4));
    }

    @Test
    void sort_InsertInPenultimateSpot_Success() {
        BigSort sort = new BigSort();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("d");
        sort.sort(list);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
        Assert.assertEquals("d",list.get(3));
        Assert.assertEquals("e",list.get(4));
    }
}