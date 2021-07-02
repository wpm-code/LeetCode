package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历迭代实现
 */
public class Iteration02 {
    public List<Integer> inorder(TreeNode root) {
        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return arrayList;
        }
        while (!stack.isEmpty()) {
            while (root!=null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                arrayList.add(node.val);
                root = root.right;
            }
        }
        return arrayList;
    }
}
