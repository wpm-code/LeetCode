package tree;

import java.util.*;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<Double> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root!=null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left!=null) {
                    queue.offer(node.left);
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                }
            }
            list.add(sum/size);
        }
        return list;
    }
}
