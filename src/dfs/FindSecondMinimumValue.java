package dfs;

/**
 * @author Marshal
 * @date 2021/7/27
 */
public class FindSecondMinimumValue {
    private int min;
    private int ans;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        ans = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (ans != -1 && node.val >= ans) {
            return;
        }
        if (node.val > min) {
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
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
