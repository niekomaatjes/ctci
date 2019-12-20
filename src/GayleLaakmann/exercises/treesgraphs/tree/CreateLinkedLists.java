package GayleLaakmann.exercises.treesgraphs.tree;

import GayleLaakmann.datastructures.queue.MyQueue;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedLists {

    List<List<TreeNode>> createDepthLists(TreeNode root) {
        MyQueue<TreeNode> visiting = new MyQueue<>();
        MyQueue<TreeNode> temp = new MyQueue<>();
        visiting.add(root);
        List<List<TreeNode>> toReturn = new LinkedList<>();
        List<TreeNode> levelNodes = new LinkedList<>();
        while (!visiting.isEmpty()) {
            TreeNode toVisit = visiting.remove();
            if (toVisit.left != null) temp.add(toVisit.left);
            if (toVisit.right != null) temp.add(toVisit.right);
            levelNodes.add(toVisit);
            if (visiting.isEmpty()) {
                visiting = temp;
                toReturn.add(levelNodes);
                temp = new MyQueue<>();
                levelNodes = new LinkedList<>();
            }
        }
        return toReturn;
    }

}
