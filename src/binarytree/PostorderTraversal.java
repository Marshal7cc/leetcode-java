package binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/6/19
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();

        postOrder(ans, root);
        return ans;
    }

    private void postOrder(List<Integer> ans, TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(ans, root.left);
        postOrder(ans, root.right);
        ans.add(root.val);
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
