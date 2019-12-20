package GayleLaakmann.exercises.treesgraphs;

import GayleLaakmann.exercises.treesgraphs.graph.Graph;
import GayleLaakmann.exercises.treesgraphs.graph.GraphNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.createGraphFromMatrix;
import static GayleLaakmann.Utils.printGraph;

class RouteBetweenDirectedGraphTest {

    @Test
    void route() {
        Graph graph = createGraphFromMatrix(new int[][]{
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        });
        printGraph(graph);
        GraphNode a = graph.nodes.get(0);
        GraphNode b = graph.nodes.get(3);
        RouteBetweenDirectedGraph route = new RouteBetweenDirectedGraph();
        Assert.assertTrue(route.route(a, b));
    }

    @Test
    void route_NoRoute_Fail() {
        Graph graph = createGraphFromMatrix(new int[][]{
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        });
        printGraph(graph);
        GraphNode a = graph.nodes.get(0);
        GraphNode b = graph.nodes.get(3);
        RouteBetweenDirectedGraph route = new RouteBetweenDirectedGraph();
        Assert.assertFalse(route.route(a, b));
    }
}