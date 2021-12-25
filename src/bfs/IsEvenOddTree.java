package bfs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Marshal
 * @since 2021/12/25
 */
public class IsEvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int preValue = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 0 && (node.val % 2 == 0 || node.val <= preValue)) {
                    return false;
                }
                if (level % 2 == 1 && (node.val % 2 == 1 || node.val >= preValue)) {
                    return false;
                }
                preValue = node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return true;
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
