package GayleLaakmann;

import GayleLaakmann.exercises.treesgraphs.graph.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void createGraphFromMatrix() {
        Graph graph = Utils.createGraphFromMatrix(new int[][] {
                {0, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 0, 0, 0},
                {0, 1, 0, 0},
        });
        Utils.printGraph(graph);
    }
}