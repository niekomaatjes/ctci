package GayleLaakmann.exercises.searchsort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SparseSearchTest {

    @Test
    void search() {
        SparseSearch sparseSearch = new SparseSearch();
        Assert.assertEquals(4, sparseSearch.search("ball", Arrays.asList("at", " ", "", "", "ball", "", "", "car", "", "", "dad", "", "")));
    }
}