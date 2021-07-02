package tree;

/**
 * 判断二叉树是否为平衡二叉树
 */
public class IsBalanced {
    public boolean isBalance (TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left)-height(root.right)) <= 1 && isBalance(root.left) && isBalance(root.right);
        }
    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
}
