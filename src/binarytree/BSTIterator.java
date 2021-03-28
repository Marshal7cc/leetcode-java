package binarytree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/28
 **/
public class BSTIterator {
    List<Integer> ans;
    Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        ans = new LinkedList<>();
        recursive(root, ans);
        iterator = ans.iterator();
    }

    private void recursive(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        recursive(root.left, ans);
        ans.add(root.val);
        recursive(root.right, ans);

    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
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
