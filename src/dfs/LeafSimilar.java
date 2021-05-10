package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/5/10
 */
public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();
        dfs(root1, seq1);
        dfs(root2, seq2);

        return seq1.equals(seq2);
    }

    public void dfs(TreeNode root, List<Integer> seq) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            seq.add(root.val);
        }
        if (root.left != null) {
            dfs(root.left, seq);
        }
        if (root.right != null) {
            dfs(root.right, seq);
        }
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
