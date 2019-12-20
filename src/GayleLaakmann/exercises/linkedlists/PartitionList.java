package GayleLaakmann.exercises.linkedlists;

import GayleLaakmann.datastructures.linkedlist.Node;

public class PartitionList {

    Node partition(Node<Integer> head, int element) {
        Node<Integer> partitionA = null;
        Node<Integer> runnerA = null;
        Node<Integer> runner = head;
        Node last = null;
        while (runner != null) {
            if (runner.val < element) {
                if (partitionA == null) {
                    partitionA = new Node<>(runner.val);
                    runnerA = partitionA;
                } else {
                    runnerA.next = new Node<>(runner.val);
                    runnerA = runnerA.next;
                }
            }
            last = runnerA;
            runner = runner.next;
        }
        Node<Integer> partitionB = null;
        Node<Integer> runnerB = null;
        runner = head;
        while (runner != null) {
            if (runner.val >= element) {
                if (partitionB == null) {
                    partitionB = new Node<>(runner.val);
                    runnerB = partitionB;
                } else {
                    runnerB.next = new Node<>(runner.val);
                    runnerB = runnerB.next;
                }
            }
            runner = runner.next;
        }
        if (partitionA == null){
            return partitionB;
        }
        last.next = partitionB;
        return partitionA;
    }

}
