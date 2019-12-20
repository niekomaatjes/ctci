package GayleLaakmann.exercises.treesgraphs;

import GayleLaakmann.datastructures.queue.MyQueue;
import GayleLaakmann.exercises.treesgraphs.graph.GraphNode;

import java.util.HashSet;
import java.util.Set;

public class RouteBetweenDirectedGraph {

    public boolean route(GraphNode a, GraphNode b) {
        Set<GraphNode> visited = new HashSet<>();
        MyQueue<GraphNode> toVisit = new MyQueue<>();
        toVisit.add(a);
        visited.add(a);
        while (!toVisit.isEmpty()) {
            GraphNode visiting = toVisit.remove();
            if (visiting == b) return true;
            for (GraphNode child : visiting.children) {
                if (visited.add(child)) {
                    toVisit.add(child);
                }
            }
        }
        return false;
    }

}
