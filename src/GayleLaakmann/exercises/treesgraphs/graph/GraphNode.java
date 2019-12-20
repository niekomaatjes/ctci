package GayleLaakmann.exercises.treesgraphs.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {

    public int value;
    public List<GraphNode> children = new LinkedList<>();

    public GraphNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
