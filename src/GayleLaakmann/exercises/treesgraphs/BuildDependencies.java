package GayleLaakmann.exercises.treesgraphs;

import GayleLaakmann.datastructures.linkedlist.Node;
import GayleLaakmann.exercises.treesgraphs.graph.GraphNode;

import java.util.*;

public class BuildDependencies {

    Stack<GraphNode> getBuildOrder(List<GraphNode> projects, GraphNode[][] dependencies) {
        for (GraphNode[] dependency : dependencies) {
            for (GraphNode project : projects) {
                if (project == dependency[1]) {
                    project.children.add(dependency[0]);
                }
            }
        }
        Stack<GraphNode> order = new Stack<>();
        Set<GraphNode> visited = new HashSet<>();
        for (GraphNode project : projects) {
            traverse(project, visited, new HashSet<>(), order);
        }
        List<Node> test = new ArrayList<>();
        return order;
    }

    public void traverse(GraphNode graphNode, Set<GraphNode> visited, Set<GraphNode> visiting, Stack<GraphNode> order) {
        if (visited.contains(graphNode)) {
            //EXPLODEEEE
        }
        for (GraphNode child : graphNode.children) {
            if (visiting.add(child)) {
                traverse(child, visited, visiting, order);
            }
        }
        order.push(graphNode);
        visited.add(graphNode);
    }

}
