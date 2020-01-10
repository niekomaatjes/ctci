package GayleLaakmann.datastructures.tree;

import GayleLaakmann.exercises.treesgraphs.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BFRandomTree {

    private final List<TreeNode> nodes = new LinkedList<>();

    public void insert(int val) {
        nodes.add(new TreeNode(val));
    }

    public void delete(int val) {
        int size = nodes.size();
        int toDelete = -1;
        for (int i = 0; i < size; i++) {
            if (nodes.get(i).data == val) {
                toDelete = i;
                break;
            }
        }
        if (toDelete >= 0) nodes.remove(toDelete);
    }

    public TreeNode find(int val) {
        for (TreeNode node : nodes) {
            if (node.data == val) return node;
        }
        return null;
    }

    public TreeNode getRandom() {
        Random rand = new Random();
        int i = rand.nextInt(nodes.size());
        TreeNode toReturn = nodes.get(i);
        nodes.remove(i);
        return toReturn;
    }

}
