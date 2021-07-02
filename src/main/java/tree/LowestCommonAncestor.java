package tree;

/**
 * 二叉树的最近公共祖先
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while (true) {
            if (p.val<node.val && q.val<node.val) {
                node = node.left;
            }else if (p.val>node.val && q.val>node.val) {
                node = node.right;
            }else {
                break;
            }
        }
        return node;
    }
}
