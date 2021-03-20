package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/3/20
 */
public class RobThree {
    // f标识选择当前节点时，子树的最大值
    private Map<TreeNode, Integer> f = new HashMap<>();
    // g标识不选择当前节点时，子树的最大值
    private Map<TreeNode, Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        // 选择root节点,那么最大值等于root节点+不选择root.left的最大值+不选择root.right的最大值
        f.put(root, root.val + g.getOrDefault(root.left, 0) + g.getOrDefault(root.right, 0));
        // 不选择root节点
        // 最大值等于
        // max{f(left),g(left)} + max{f(right),g(right)}
        g.put(root, Math.max(f.getOrDefault(root.left, 0), g.getOrDefault(root.left, 0)) + Math.max(f.getOrDefault(root.right, 0), g.getOrDefault(root.right, 0)));
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
