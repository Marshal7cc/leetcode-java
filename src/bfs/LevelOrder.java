package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Marshal
 * @date 2021/8/7
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        // 借助队列保存某一层的所有元素
        // 队列先进先出,优先遍历当前层元素的同时,将下一层的元素放入队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 第1层
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            // 先计算出当前Level有多少个元素,避免多/少取
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    // 下一level的元素放在队尾
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    // 下一level的元素放在队尾
                    queue.offer(node.right);
                }
            }
            ans.add(level);
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
