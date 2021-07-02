package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历迭代实现
 */
public class Iteration03 {
    public List<Integer> order(TreeNode root) {
        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return arrayList;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            arrayList.add(node.val);
            if (node.left!=null) {
                stack.push(node.left);
            }
            if (node.right!=null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
