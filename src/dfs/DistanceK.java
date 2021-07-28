package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/7/28
 */
public class DistanceK {
    List<Integer> ans;
    Map<Integer, TreeNode> map;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ans = new ArrayList<>();
        map = new HashMap<>();

        findParents(root);

        dfs(target, null, 0, k);
        return ans;
    }

    private void dfs(TreeNode node, TreeNode from, int depth, int k) {
        if (depth == k) {
            ans.add(node.val);
            return;
        }
        if (node.left != from && node.left != null) {
            dfs(node.left, node, depth + 1, k);
        }
        if (node.right != from && node.right != null) {
            dfs(node.right, node, depth + 1, k);
        }
        if (map.get(node.val) != from && map.get(node.val) != null) {
            dfs(map.get(node.val), node, depth + 1, k);
        }
    }

    private void findParents(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            map.put(node.left.val, node);
            findParents(node.left);
        }
        if (node.right != null) {
            map.put(node.right.val, node);
            findParents(node.right);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
