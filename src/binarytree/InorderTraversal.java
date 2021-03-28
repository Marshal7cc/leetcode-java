package binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/28
 */
public class InorderTraversal {
    // 递归做法
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        recursive(root, ans);
        return ans;
    }

    private void recursive(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        recursive(root.left, ans);
        ans.add(root.val);
        recursive(root.right, ans);

    }

    public List<Integer> inorderTraversalIteration(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
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
