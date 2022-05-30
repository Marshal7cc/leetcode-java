package dfs;

/**
 * @author Marshal
 * @since 2022/5/30
 */
public class SumRootToLeaf {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        // 只对第一次head生效
        if (root == null) {
            return 0;
        }
        // sum*2+val
        sum = (sum << 1) | root.val;
        // 叶子节点返回
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
