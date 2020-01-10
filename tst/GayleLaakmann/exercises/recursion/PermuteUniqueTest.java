package GayleLaakmann.exercises.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermuteUniqueTest {

    @Test
    void permuteUnique() {
        PermuteUnique permuteUnique = new PermuteUnique();
        final List<List<Integer>> lists = permuteUnique.permuteUnique(new int[]{1, 1, 2});
    }
}