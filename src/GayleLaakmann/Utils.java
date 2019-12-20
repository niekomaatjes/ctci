package GayleLaakmann;

import GayleLaakmann.datastructures.linkedlist.Node;
import GayleLaakmann.exercises.treesgraphs.graph.Graph;
import GayleLaakmann.exercises.treesgraphs.graph.GraphNode;

import java.util.LinkedList;
import java.util.List;

public class Utils {
    public static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static <E> Node createLinkedList(E... elements) {
        Node<E> head = null;
        Node current = null;
        for (E element : elements) {
            if (head == null) {
                head = new Node<>(element);
                current = head;
            } else {
                current.next = new Node<>(element);
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node n = head;
        StringBuilder builder = new StringBuilder();
        while (n != null) {
            builder.append(n.val);
            if (n.next != null) builder.append("->");
            n = n.next;
        }
        System.out.println(builder);
    }

    public static void printArr(int[] arr) {
        for (int n : arr) System.out.print(n);
        System.out.println();
    }

    public static Graph createGraphFromMatrix(int[][] adjMatrix) {
        Graph graph = new Graph();
        List<GraphNode> graphNodes = new LinkedList<>();
        graph.nodes = graphNodes;
        for (int r = 0; r < adjMatrix.length; r++) {
            graphNodes.add(new GraphNode(r));
        }
        for (GraphNode root : graphNodes) {
            for (int c = 0; c < adjMatrix[0].length; c++) {
                if (adjMatrix[root.value][c] == 1) {
                    for (GraphNode child : graphNodes) {
                        if (child.value == c) root.children.add(child);
                    }
                }
            }
        }
        return graph;
    }

    public static void printGraph(Graph graph) {
        StringBuilder builder = new StringBuilder();
        for (GraphNode node : graph.nodes) {
            builder.append(node).append(":");
            for (GraphNode child : node.children) {
                builder.append(child).append(" ");
            }
            builder.append('\n');
        }
        System.out.println(builder);
    }


}
