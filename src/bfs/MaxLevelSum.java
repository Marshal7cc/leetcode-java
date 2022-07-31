package bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/7/31
 */
public class MaxLevelSum {
    public int maxLevelSum(TreeNode root) {
        int ans = 1;
        int maxSum = root.val;
        List<TreeNode> q = new ArrayList<>();
        q.add(root);

        int level = 1;
        while (!q.isEmpty()) {
            int levelSum = 0;
            List<TreeNode> lq = new ArrayList<>();

            for (TreeNode n : q) {
                levelSum += n.val;
                if (n.left != null) {
                    lq.add(n.left);
                }
                if (n.right != null) {
                    lq.add(n.right);
                }
            }

            if (levelSum > maxSum) {
                ans = level;
                maxSum = levelSum;
            }
            q = lq;
            level++;
        }
        return ans;
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
