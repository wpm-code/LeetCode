package tree;

public class PathSum {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return dfs(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum-=root.val;
        return (sum==0?1:0)+dfs(root.left,sum)+dfs(root.right,sum);
    }
}
