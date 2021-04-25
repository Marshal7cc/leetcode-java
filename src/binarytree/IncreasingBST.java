package binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/4/25
 */
public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> seq = new LinkedList<>();
        dfs(root, seq);

        // 虚拟头节点
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        for (Integer val : seq) {
            cur.right = new TreeNode(val);
            cur = cur.right;
        }

        return dummy.right;
    }

    private void dfs(TreeNode root, List<Integer> seq) {
        if (root == null) {
            return;
        }
        dfs(root.left, seq);
        seq.add(root.val);
        dfs(root.right, seq);
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
