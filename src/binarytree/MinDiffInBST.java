package binarytree;

/**
 * @author Marshal
 * @date 2021/4/13
 */
public class MinDiffInBST {
    private int pre;
    private int ans;

    public int minDiffInBST(TreeNode root) {
        this.ans = Integer.MAX_VALUE;
        this.pre = -1;
        dfs(root);
        return this.ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        int v = root.val;
        // 特殊情况，最小数
        if (pre == -1) {
            pre = v;
        } else {
            ans = Math.min(ans, v - pre);
            pre = v;
        }
        dfs(root.right);
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
