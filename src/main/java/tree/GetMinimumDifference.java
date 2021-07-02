package tree;

/**
 * 计算二叉树任意两个节点的差的绝对值的最小值
 */
public class GetMinimumDifference {
    int pre=-1;
    int res=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return -1;
        }
        getMinimumDifference(root.left);
        if (pre == -1) {
            pre = root.val;
        }else  {
            res = Math.min(res, root.val-pre);
            pre = root.val;
        }
        getMinimumDifference(root.right);
        return res;
    }
}
