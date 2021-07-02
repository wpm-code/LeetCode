package tree;

/**
 * 最大树定义：一个树，其中每个节点的值都大于其子树中的任何其他值。
 */
public class InsertIntoMaxTree {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null || root.val < val) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        TreeNode node = insertIntoMaxTree(root.right, val);
        root.right = node;
        return root;
    }
}
