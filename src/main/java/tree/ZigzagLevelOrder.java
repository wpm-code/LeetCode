package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 锯齿状遍历二叉树
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root!=null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < queue.size(); i++) {

                TreeNode node = queue.poll();
                if (list.size() % 2 == 0) {
                    linkedList.offerLast(node.val);
                }
                if (list.size() % 2 == 1) {
                    linkedList.offerFirst(node.val);
                }
                if (node.left!=null) {
                    queue.offer(node.left);
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                }

            }
            list.add(linkedList);
        }
        return list;
    }
}
